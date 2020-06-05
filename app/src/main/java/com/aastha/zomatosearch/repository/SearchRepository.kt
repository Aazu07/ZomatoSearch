package com.aastha.zomatosearch.repository

import com.aastha.zomatosearch.entities.Restaurant
import com.aastha.zomatosearch.entities.RestaurantObject
import com.aastha.zomatosearch.networking.ApiServiceClient

class SearchRepository {

    suspend fun getResultsFromAPI(query: String): ArrayList<RestaurantObject> {
        val url = "https://developers.zomato.com/api/v2.1/search?q=$query"
        val call = ApiServiceClient.instance.getSearchResults(url)
        val response = call.execute()
        response.body()?.let {
            if (it.resultsFound > 0) {
                return getDataFromList(it.restaurants)
            }
        }
        return ArrayList()
    }

    private fun getDataFromList(restaurantList: List<Restaurant>?): ArrayList<RestaurantObject> {
        val arrayList = ArrayList<RestaurantObject>()
        if (restaurantList != null) {
            for (restaurant in restaurantList) {
                arrayList.add(restaurant.restaurant!!)
            }
        }
        return arrayList
    }
}