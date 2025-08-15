package com.example.greetingcard.vegetables.data

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://phitron-sdt-assignment-05.vercel.app"

class VegetableApiService {

    val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
}

interface IVegetableApiService {
    @GET("product-list")
    fun getPhotos(): String
}