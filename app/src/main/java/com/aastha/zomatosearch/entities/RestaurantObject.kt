package com.aastha.zomatosearch.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class RestaurantObject {
//    @SerializedName("R")
//    @Expose
//    var r: R? = null

    @SerializedName("apikey")
    @Expose
    var apikey: String? = null

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("location")
    @Expose
    var location: LocationObject? = null

    @SerializedName("switch_to_order_menu")
    @Expose
    var switchToOrderMenu: Int? = null

    @SerializedName("cuisines")
    @Expose
    var cuisines: String? = null

    @SerializedName("timings")
    @Expose
    var timings: String? = null

    @SerializedName("average_cost_for_two")
    @Expose
    var averageCostForTwo: Int? = null

    @SerializedName("price_range")
    @Expose
    var priceRange: Int? = null

    @SerializedName("currency")
    @Expose
    var currency: String? = null

    @SerializedName("highlights")
    @Expose
    var highlights: List<String>? = null

    @SerializedName("offers")
    @Expose
    var offers: List<Any>? = null

    @SerializedName("opentable_support")
    @Expose
    var opentableSupport: Int? = null

    @SerializedName("is_zomato_book_res")
    @Expose
    var isZomatoBookRes: Int? = null

    @SerializedName("mezzo_provider")
    @Expose
    var mezzoProvider: String? = null

    @SerializedName("is_book_form_web_view")
    @Expose
    var isBookFormWebView: Int? = null

    @SerializedName("book_form_web_view_url")
    @Expose
    var bookFormWebViewUrl: String? = null

    @SerializedName("book_again_url")
    @Expose
    var bookAgainUrl: String? = null

    @SerializedName("thumb")
    @Expose
    var thumb: String? = null

    @SerializedName("user_rating")
    @Expose
    var userRating: UserRating? = null

    @SerializedName("all_reviews_count")
    @Expose
    var allReviewsCount: Int? = null

    @SerializedName("photos_url")
    @Expose
    var photosUrl: String? = null

    @SerializedName("photo_count")
    @Expose
    var photoCount: Int? = null

//    @SerializedName("photos")
//    @Expose
//    var photos: List<Photo>? = null

    @SerializedName("menu_url")
    @Expose
    var menuUrl: String? = null

    @SerializedName("featured_image")
    @Expose
    var featuredImage: String? = null

    @SerializedName("has_online_delivery")
    @Expose
    var hasOnlineDelivery: Int? = null

    @SerializedName("is_delivering_now")
    @Expose
    var isDeliveringNow: Int? = null

    @SerializedName("store_type")
    @Expose
    var storeType: String? = null

    @SerializedName("include_bogo_offers")
    @Expose
    var includeBogoOffers: Boolean? = null

    @SerializedName("deeplink")
    @Expose
    var deeplink: String? = null

    @SerializedName("is_table_reservation_supported")
    @Expose
    var isTableReservationSupported: Int? = null

    @SerializedName("has_table_booking")
    @Expose
    var hasTableBooking: Int? = null

    @SerializedName("events_url")
    @Expose
    var eventsUrl: String? = null

    @SerializedName("phone_numbers")
    @Expose
    var phoneNumbers: String? = null

//    @SerializedName("all_reviews")
//    @Expose
//    var allReviews: AllReviews? = null

    @SerializedName("establishment")
    @Expose
    var establishment: List<String>? = null

    @SerializedName("establishment_types")
    @Expose
    var establishmentTypes: List<Any>? = null
}
