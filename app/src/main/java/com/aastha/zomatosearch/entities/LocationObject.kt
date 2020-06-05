package com.aastha.zomatosearch.entities

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class LocationObject {
    @SerializedName("address")
    @Expose
    var address: String? = null

    @SerializedName("locality")
    @Expose
    var locality: String? = null

    @SerializedName("city")
    @Expose
    var city: String? = null

    @SerializedName("city_id")
    @Expose
    var cityId: Int? = null

    @SerializedName("latitude")
    @Expose
    var latitude: String? = null

    @SerializedName("longitude")
    @Expose
    var longitude: String? = null

    @SerializedName("zipcode")
    @Expose
    var zipcode: String? = null

    @SerializedName("country_id")
    @Expose
    var countryId: Int? = null

    @SerializedName("locality_verbose")
    @Expose
    var localityVerbose: String? = null
}
