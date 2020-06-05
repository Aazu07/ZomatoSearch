package com.aastha.zomatosearch.entities

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class UserRating {
    @SerializedName("aggregate_rating")
    @Expose
    var aggregateRating: String? = null

    @SerializedName("rating_text")
    @Expose
    var ratingText: String? = null

    @SerializedName("rating_color")
    @Expose
    var ratingColor: String? = null

//    @SerializedName("rating_obj")
//    @Expose
//    var ratingObj: RatingObj? = null

    @SerializedName("votes")
    @Expose
    var votes: String? = null

}
