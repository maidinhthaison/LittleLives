package data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jetpack.demo.R
import data.response.EventData
import di.LocalModule
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import java.util.*
import javax.inject.Inject

class AppLocalDataSource @Inject constructor(
    private val dataStore: DataStore<Preferences>,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO,
    private val gson: Gson = LocalModule.provideGson()
): BaseLocalDataSource(){
    /**
     * ### Return uuid from DataStore
     * If it's not exited, generate random uuid ONCE time then save to DataStore
     */
    suspend fun getUUID(): Flow<String> {
        return withContext(dispatcher) {
            dataStore.edit { settings ->
                if (settings[deviceUUID] == null) {
                    settings[deviceUUID] = UUID.randomUUID().toString().replace("-", "")
                }
            }
            dataStore.data.map { preferences -> preferences[deviceUUID]!! }
        }
    }

    suspend fun setAuthKey(authKey: String) {
        withContext(dispatcher) {
            dataStore.edit { settings ->
                settings[authKeyId] = authKey
            }
        }
    }

    suspend fun getAuthKey(): Flow<String?> {
        return withContext(dispatcher) {
            dataStore.data.map { preferences -> preferences[authKeyId] }
        }
    }

    suspend fun getNewsEvent(mContext: Context): data.Result<EventData?>{
        return  withContext(dispatcher) {
            getResult {
                val inputAsString =
                    mContext.resources.openRawResource(R.raw.user_stories).bufferedReader()
                        .use { it.readText() }
                gson.fromJson(inputAsString, object : TypeToken<EventData>() {}.type)
            }

        }

    }

}