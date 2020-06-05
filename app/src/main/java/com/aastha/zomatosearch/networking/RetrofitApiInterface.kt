package com.aastha.zomatosearch.networking

import com.aastha.zomatosearch.entities.SearchResults
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url

interface RetrofitApiInterface {
    @Headers(
        "user-key: 3e46c2649d99164f79e4c24fd9a4475c"
    )
    @GET
    fun getSearchResults(@Url url: String?): Call<SearchResults?>
}