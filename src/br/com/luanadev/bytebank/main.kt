package br.com.luanadev.bytebank

import br.com.luanadev.bytebank.modelo.cliente.Endereco
import java.lang.IllegalArgumentException

fun main() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueito", complemento = "predio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalArgumentException("Preencha o campo complemento!")
        println(tamanhoComplemento)
    }
    testes("")
    testes(1)
}

fun testes(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}










