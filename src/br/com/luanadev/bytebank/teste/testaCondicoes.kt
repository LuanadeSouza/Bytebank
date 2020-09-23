package br.com.luanadev.bytebank.teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("br.com.luanadev.bytebank.modelo.conta.Conta com saldo: $saldo")
    } else if (saldo == 0.0) {
        println("br.com.luanadev.bytebank.modelo.conta.Conta com saldo: $saldo")
    } else {
        println("br.com.luanadev.bytebank.modelo.conta.Conta com saldo: $saldo.")
    }

    when {
        saldo > 0.0 -> println("br.com.luanadev.bytebank.modelo.conta.Conta com saldo: $saldo ")
        saldo == 0.0 -> println("br.com.luanadev.bytebank.modelo.conta.Conta com saldo: $saldo")
        else -> println("br.com.luanadev.bytebank.modelo.conta.Conta com saldo: $saldo")
    }
}