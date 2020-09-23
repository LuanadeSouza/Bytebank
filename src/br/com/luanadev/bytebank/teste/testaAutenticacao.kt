package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.cliente.Cliente
import br.com.luanadev.bytebank.modelo.funcionario.Diretor
import br.com.luanadev.bytebank.modelo.funcionario.Gerente
import br.com.luanadev.bytebank.modelo.funcionario.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}