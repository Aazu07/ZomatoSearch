package com.aastha.zomatosearch.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.aastha.zomatosearch.R
import com.aastha.zomatosearch.entities.RestaurantObject
import com.aastha.zomatosearch.repository.SearchRepository
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class MainActivityViewModel(application: Application) : AndroidViewModel(application),
    CoroutineScope {
    val searchResults = MutableLiveData<ArrayList<RestaurantObject>>()
    var isLoading = MutableLiveData<Boolean>(false)
    var errorMessage = MutableLiveData<String>("")
    val repository = SearchRepository()

    fun getSearchData(query: String) {
        isLoading.value = true
        launch {
            val apiresult = repository.getResultsFromAPI(query)
            if (apiresult.isNotEmpty()) {
                isLoading.postValue(false)
                searchResults.postValue(apiresult)
                errorMessage.postValue("")
            } else {
                isLoading.postValue(false)
                errorMessage.postValue(
                    (getApplication() as Application).applicationContext.getString(
                        R.string.no_results_found
                    )
                )
            }
        }
    }

    private var job: Job = Job()

    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
        exception.printStackTrace()
        isLoading.value = false
        errorMessage.value = application.getString(R.string.network_failure)
        job = Job()
    }

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO + job + coroutineExceptionHandler
}