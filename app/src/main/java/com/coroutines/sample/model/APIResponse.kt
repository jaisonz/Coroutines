package com.coroutines.sample.model

import com.coroutines.sample.constants.APIConstants
import com.google.gson.annotations.SerializedName

/**
 * API response object model
 */
class APIResponse {
    @SerializedName(APIConstants.KEY_TITLE)
    val title: String? = null

    @SerializedName(APIConstants.KEY_ROWS)
    val rows: List<Rows>? = null
}