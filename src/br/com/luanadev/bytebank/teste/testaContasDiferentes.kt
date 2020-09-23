package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.cliente.Cliente
import br.com.luanadev.bytebank.modelo.conta.ContaCorrente
import br.com.luanadev.bytebank.modelo.conta.ContaPoupanca

fun testaContasDiferentes() {
    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)
    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )
    val fran = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 2)
    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo Conta Corrente: ${contaCorrente.saldo}")
    println("saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo Conta Corrente: ${contaCorrente.saldo}")
    println("saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo Conta Corrente: ${contaCorrente.saldo}")
    println("saldo Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo Conta Corrente: ${contaCorrente.saldo}")
    println("saldo Conta Poupança: ${contaPoupanca.saldo}")
}