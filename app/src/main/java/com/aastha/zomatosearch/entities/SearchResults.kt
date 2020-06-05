package com.aastha.zomatosearch.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SearchResults {

    @SerializedName("results_found")
    @Expose
    var resultsFound: Int = 0

    @SerializedName("results_start")
    @Expose
    var resultsStart: Int = 0

    @SerializedName("results_shown")
    @Expose
    var resultsShown: Int = 0

    @SerializedName("restaurants")
    @Expose
    var restaurants: List<Restaurant>? = null

}