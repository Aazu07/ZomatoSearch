package com.aastha.zomatosearch.entities

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class Restaurant {
    @SerializedName("restaurant")
    @Expose
    var restaurant: RestaurantObject? = null
}
