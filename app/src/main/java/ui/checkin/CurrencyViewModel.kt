package ui.checkin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import data.repository.CurrencyRepository
import kotlinx.coroutines.launch
import javax.inject.Inject
import data.Result
import data.remote.response.CurrencyResponse
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

@HiltViewModel
class CurrencyViewModel @Inject constructor(private val currencyRepository: CurrencyRepository) :
    ViewModel() {
    private val _getCurrencyResult = MutableSharedFlow<GetCurrencyResult>()
    val getCurrencyResult: SharedFlow<GetCurrencyResult> = _getCurrencyResult

    fun getListCurrency(counter_currency: String) {
        viewModelScope.launch {
            when (val result = currencyRepository.getCurrencyRepo(counter_currency)) {
                is Result.Success<CurrencyResponse> -> {
                    _getCurrencyResult.emit(
                        GetCurrencyResult(
                            success = GetCurrencyView(
                                currencyResponse = result.data
                            )
                        )
                    )
                }
                is Result.NetworkError -> {
                    _getCurrencyResult.emit(
                        GetCurrencyResult(
                            error = "Network Error"
                        )
                    )
                }
                is Result.GenericError -> {
                    if (result.code == 500) {
                        _getCurrencyResult.emit(
                            GetCurrencyResult(
                                error = "Server Error"
                            )
                        )

                    }
                }
                else -> {
                    _getCurrencyResult.emit(
                        GetCurrencyResult(
                            error = "Unknown Error"
                        )
                    )
                }
            }
        }
    }
}