package br.com.luanadev.bytebank.teste

import java.lang.NumberFormatException

fun testaExpressao() {
    val entrada: String = "1.0"
    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problemas na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }

    if (valorComTaxa != null) {
        println("valor recebido: $valorComTaxa")
    } else {
        println("valor invalido")
    }
}
