package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.cliente.Cliente
import br.com.luanadev.bytebank.modelo.funcionario.Analista
import br.com.luanadev.bytebank.modelo.funcionario.Gerente
import br.com.luanadev.bytebank.modelo.funcionario.SistemaInterno

fun testaAutenticacaoTiposDiferentes() {

    //analista implementando Autenticavel
    val analista = Analista(
        nome = "Alex",
        cpf = "",
        salario = 1000.0,
        senha = 1000
    )

    //gerente herda de FuncionarioAdmin que implementa Autenticavel
    val gerente = Gerente(
        nome = "Fran",
        cpf = "",
        salario = 2000.0,
        senha = 2000
    )

    val cliente = Cliente(
        nome = "Fran",
        cpf = "",
        senha = 3000
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra(analista, 1000)
    sistemaInterno.entra(gerente, 2000)
    sistemaInterno.entra(cliente, 3000)
}