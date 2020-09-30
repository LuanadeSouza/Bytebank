package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.exception.SaldoInduficienteException

fun testaPilhas() {
    println("início main")
    testaComportamentosConta()
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