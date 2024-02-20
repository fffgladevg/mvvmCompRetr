package com.example.mvvpjetpackretrtest.service

import com.example.mvvpjetpackretrtest.model.CreditCardResponse
import retrofit2.http.GET

interface CreditCardService {
    @GET("credit_cards")
    suspend fun getCreditCards(): CreditCardResponse
}