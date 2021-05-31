package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Marcos")
        val cartao = Cartao("12345678910")
        return Conta(
            "445655-4",
            "6552-4",
            "R$ 3.526,80",
            "R$ 4.120,00",
            cliente,
            cartao
        )
    }
}