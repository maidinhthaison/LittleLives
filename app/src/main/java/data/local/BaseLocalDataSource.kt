package data.local

import data.Result
import java.io.FileNotFoundException
import java.io.IOException

abstract class BaseLocalDataSource {
    protected suspend fun <T> getResult(call: suspend () -> T): Result<T> {
        try {
            val response = call()
            return Result.Success(response)
        } catch (e: Exception) {
            if(e is FileNotFoundException){
                return Result.FileNotFoundError
            }
            else if (e is IOException) {
                return Result.IOError
            }
            return Result.UnknownError(e)
        }
    }
}