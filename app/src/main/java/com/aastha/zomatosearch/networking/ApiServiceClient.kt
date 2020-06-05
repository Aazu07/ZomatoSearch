package com.aastha.zomatosearch.networking

class ApiServiceClient {
    companion object {
        val instance: RetrofitApiInterface by lazy {
            BaseApiService.baseRetrofitClient.create(RetrofitApiInterface::class.java)
        }
    }
}