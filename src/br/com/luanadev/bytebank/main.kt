package br.com.luanadev.bytebank

import br.com.luanadev.bytebank.modelo.cliente.Cliente
import br.com.luanadev.bytebank.modelo.conta.Conta
import br.com.luanadev.bytebank.modelo.conta.ContaPoupanca
import br.com.luanadev.bytebank.teste.testaContasDiferentes

fun main() {

    val alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)

    val fran = object {
        val nome: String = "Fran"
        val cpf: String = "222.222.222-22"
        val senha: Int = 100

        fun autentica(senha: Int) = this.senha == senha
    }


    testaContasDiferentes()
    println("Total de contas: ${Conta.total}")
}






