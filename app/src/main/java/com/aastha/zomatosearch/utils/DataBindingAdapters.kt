package com.aastha.zomatosearch.utils

import android.graphics.Color
import android.text.TextUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.aastha.zomatosearch.R
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

object DataBindingAdapters {

    @JvmStatic
    @BindingAdapter("loadURL")
    fun loadURL(imageView: ImageView, url: String?) {
        if (!TextUtils.isEmpty(url)) {
            Glide.with(imageView.context).load(url)
                .apply(
                    RequestOptions().placeholder(R.drawable.placeholder)
                        .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                        .error(R.drawable.placeholder)
                )
                .into(imageView)
        } else {
            imageView.setImageResource(R.drawable.placeholder)
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