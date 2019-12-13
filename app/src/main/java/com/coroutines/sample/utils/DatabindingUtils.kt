package com.coroutines.sample.utils


import android.widget.ImageView


import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.coroutines.sample.R

/**
 * Databinding method that creates custom attribute for Views
 */
object DataBindingUtils {

    private const val IMAGE_URL = "bind:imageUrl"

    /**
     * Custom attribute for ImageView to set from image URL
     */
    @JvmStatic
    @BindingAdapter(IMAGE_URL)
    fun loadImage(view: ImageView, imageUrl: String?) {
        if (imageUrl == null){
            view.setImageResource(R.drawable.kotlin_icon)
        }else{
            imageUrl.run {
                Glide.with(view.context)
                    .load(imageUrl)
                    .centerCrop()
                    .placeholder(R.drawable.kotlin_icon)
                    .into(view)
            }

        }
    }
}