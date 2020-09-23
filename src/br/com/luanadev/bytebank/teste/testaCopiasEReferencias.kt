package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.cliente.Cliente
import br.com.luanadev.bytebank.modelo.conta.ContaCorrente
import br.com.luanadev.bytebank.modelo.conta.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)
    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular = joao

    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)
    val contaMaria = ContaPoupanca(maria, 1003)
    contaMaria.titular = maria
    contaJoao.titular = joao

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}