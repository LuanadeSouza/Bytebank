package br.com.luanadev.bytebank

import br.com.luanadev.bytebank.exception.SaldoInduficienteException
import br.com.luanadev.bytebank.modelo.cliente.Endereco
import java.lang.ClassCastException
import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}
fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    } catch (e: SaldoInduficienteException) {
        e.printStackTrace()
        println("SaldoInduficienteException foi pega")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInduficienteException()
    }
    println("fim funcao2")
}










