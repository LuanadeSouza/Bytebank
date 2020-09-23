package teste

import conta.ContaCorrente
import conta.ContaPoupanca

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

    println("saldo conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo conta.Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo conta.Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo conta.Conta Poupança: ${contaPoupanca.saldo}")
    println("---------------------------------------")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo conta.Conta Corrente: ${contaCorrente.saldo}")
    println("saldo conta.Conta Poupança: ${contaPoupanca.saldo}")
}