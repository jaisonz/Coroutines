package com.coroutines.sample.model

import com.coroutines.sample.constants.APIConstants
import com.google.gson.annotations.SerializedName

/**
 * API response object model
 */
class Rows {
    @SerializedName(APIConstants.KEY_TITLE)
    val title: String? = null
    @SerializedName(APIConstants.KEY_DESCRIPTION)
    val description: String? = null
    @SerializedName(APIConstants.KEY_IMAGE_URL)
    val imageHref: String? = null
}
