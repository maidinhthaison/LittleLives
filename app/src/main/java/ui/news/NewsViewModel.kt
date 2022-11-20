package ui.news

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import data.Result
import data.repository.NewsRepository
import data.response.EventData
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val newsRepository: NewsRepository) :
    ViewModel() {
    private val _getNewsResult = MutableSharedFlow<GetNewsResult>()
    val getNewsResult: SharedFlow<GetNewsResult> = _getNewsResult

    fun getListEvent(context: Context) {
        viewModelScope.launch {
            when (val result = newsRepository.getEventRepo(context)) {
                is Result.Success<EventData?> -> {

                    _getNewsResult.emit(
                        GetNewsResult(
                            success = GetNewsView(
                                eventData = result.data as EventData
                            )
                        )
                    )
                }
                is Result.FileNotFoundError -> {
                    _getNewsResult.emit(
                        GetNewsResult(
                            error = "File Not Found"
                        )
                    )
                }
                is Result.IOError -> {
                    _getNewsResult.emit(
                        GetNewsResult(
                            error = "IO Error"
                        )
                    )
                }
                else -> {
                    _getNewsResult.emit(
                        GetNewsResult(
                            error = "Reading user_stories.json causes error!!!"
                        )
                    )
                }
            }
        }
    }

}