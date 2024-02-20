package com.example.mvvpjetpackretrtest.data

import com.example.mvvpjetpackretrtest.model.CreditCard
import com.example.mvvpjetpackretrtest.model.CreditCardResponse
import com.example.mvvpjetpackretrtest.service.RetrofitInstance

class CreditCardRepository {
    private val creditCardService = RetrofitInstance.creditCardService

    suspend fun getCreditCards(): CreditCardResponse {
        return creditCardService.getCreditCards()
    }
}