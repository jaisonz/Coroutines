package com.coroutines.sample.utils.networkutils

import com.coroutines.sample.constants.APIConstants
import com.coroutines.sample.model.APIResponse
import retrofit2.Call
import retrofit2.Response

import retrofit2.http.GET

/**
 * Retrofit interface class
 */
interface APIEndpoint {
    @GET(APIConstants.API_ENDPOINT)
    suspend fun response(): Response<APIResponse>
}
