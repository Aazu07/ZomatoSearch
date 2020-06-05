package com.aastha.zomatosearch.networking

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface BaseApiService {
    companion object {
        val baseRetrofitClient: Retrofit by lazy {
            val okHttpClientBuilder = OkHttpClient.Builder()
            Retrofit.Builder()
                .client(okHttpClientBuilder.build())
                // just added base url as retrofit2 was not allowing to create a client
                // we will use @Url for all our calls as we have dynamic url(s)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://developers.zomato.com/api/v2.1/")
                .build()
        }

    }

}