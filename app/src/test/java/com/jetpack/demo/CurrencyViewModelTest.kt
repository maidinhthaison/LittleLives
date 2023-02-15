package com.jetpack.demo

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import data.Result
import data.remote.response.CurrencyResponse
import data.remote.response.Info
import data.repository.CurrencyRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.MockitoAnnotations
import ui.checkin.CurrencyViewModel

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class CurrencyViewModelTest {
    private val testDispatcher = TestCoroutineDispatcher()
    private lateinit var currencyViewModel: CurrencyViewModel

    lateinit var currencyRepository: CurrencyRepository


    @get:Rule
    val instantTaskExecutionRule: InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        Dispatchers.setMain(testDispatcher)
        currencyRepository = mock(currencyRepository::class.java)
        currencyViewModel = CurrencyViewModel(currencyRepository)
    }

    @Test
    fun getListCurrencyTest() {
        runBlocking {
            Mockito.`when`(currencyRepository.getCurrencyRepo("USD"))
                .thenReturn(Result.Success<CurrencyResponse>(CurrencyResponse(listOf<Info>(Info("a", "b", "c","d","e","f")))))
            val result = currencyViewModel.getListCurrency("USD")
            assertEquals((listOf<Info>(Info("a", "b", "c","d","e","f"))), result)
        }
    }


    @Test
    fun `empty list test`() {
        runBlocking {
            Mockito.`when`(currencyRepository.getCurrencyRepo("USD"))
                .thenReturn(Result.Success<CurrencyResponse>(CurrencyResponse(listOf<Info>(Info("a", "b", "c","d","e","f")))))
            val result = currencyViewModel.getListCurrency("USD")
            assertEquals(null, result)
        }
    }

}