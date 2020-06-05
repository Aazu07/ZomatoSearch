package com.aastha.zomatosearch.utils

import android.graphics.Color
import android.text.TextUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object DataBindingAdapters {

    @JvmStatic
    @BindingAdapter("loadURL")
    fun loadURL(imageView: ImageView, url: String?) {
        if (!TextUtils.isEmpty(url)) {
            Glide.with(imageView.context).load(url).into(imageView)
        }
    }

    @JvmStatic
    @BindingAdapter("color_background")
    fun backgroundColor(view: TextView, color: String?) {
        if (!TextUtils.isEmpty(color)) {
            val colorCode = "#$color"
            view.setBackgroundColor(Color.parseColor(colorCode))
        }
    }
}