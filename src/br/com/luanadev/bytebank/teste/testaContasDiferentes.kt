package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.conta.ContaCorrente
import br.com.luanadev.bytebank.modelo.conta.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo br.com.luanadev.bytebank.modelo.conta.Conta Poupança: ${contaPoupanca.saldo}")
}