package com.example.datalayer

/**
 * @Author: Archana Kumari
 * @Date: 13-03-2023
 */
class RetrofitClient private constructor() {
   // var retrofit : Retrofit;
    init{

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