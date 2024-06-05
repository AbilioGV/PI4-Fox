package com.example.fox

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

class Retrofit {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://6d1e4595-9224-4649-84af-7645327f8a68-00-2rtji2jfsrkaz.spock.replit.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}
