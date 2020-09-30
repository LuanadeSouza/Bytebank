package br.com.luanadev.collections

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayDeObjetos() {

    val salarios = bigDecimalArrayOf("1500.00", "2000.00", "5000.00", "10000.00")
    println(salarios.contentDeepToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento = salarios.map { salario ->
        if (salario > "5000".toBigDecimal()) {
            salario + "500".toBigDecimal()
        }else{
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
    }
    println(salariosComAumento)
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}