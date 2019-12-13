package com.coroutines.sample.utils


import android.widget.ImageView


import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.coroutines.sample.R


object DataBindingUtils {
    @JvmStatic
    @BindingAdapter("bind:imageUrl")
    fun loadImage(view: ImageView, imageUrl: String?) {
        imageUrl?.run {
            Glide
                .with(view.context)
                .load(imageUrl)
                .centerCrop()
                .placeholder(R.drawable.kotlin_icon)
                .into(view)
        }
    }
}