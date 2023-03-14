package com.example.datalayer

import com.example.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @Author: Archana Kumari
 * @Date: 13-03-2023
 */
class RetrofitClient private constructor() {
    lateinit var retrofit: Retrofit;

    init {
        retrofit = Retrofit.Builder().baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    companion object {
        @Volatile
        private var mInstance: RetrofitClient? = null
        fun getInstance(): RetrofitClient {
            if (mInstance == null) {
                synchronized(this) {
                    if (mInstance == null) {
                        mInstance = RetrofitClient()
                    }
                }
            }
            return mInstance!!
        }
    }
}