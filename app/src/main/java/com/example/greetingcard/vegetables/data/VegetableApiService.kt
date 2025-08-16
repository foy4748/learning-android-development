package com.example.greetingcard.vegetables.data

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://phitron-sdt-assignment-05.vercel.app"

val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()


interface VegetableApiService {
    @GET("product-list")
    suspend fun getVegetables(): String
}
object VegetableApi {
    val retrofitService : VegetableApiService by lazy {
        retrofit.create(VegetableApiService::class.java)
    }
}
