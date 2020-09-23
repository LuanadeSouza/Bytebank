package teste

import conta.ContaCorrente
import conta.ContaPoupanca

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(-200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    val contaFran = ContaPoupanca(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(350.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)


    println("Transferencia da conta da Fran para a conta do Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}