package com.coroutines.sample.webservice

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.Gson

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 * Retrofit Utility class
 */
object RetrofitService {
    private const val BASE_URL = "https://dl.dropboxusercontent.com/"

    //OKHttp Client
    private var client = OkHttpClient.Builder()
        .connectTimeout(100, TimeUnit.SECONDS)
        .readTimeout(100, TimeUnit.SECONDS).build()

    //Retrofit Builder
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL).client(client)
        .addConverterFactory(GsonConverterFactory.create(Gson()))
        .build()

    fun <S> createService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }
}