fun main() {

    println("Bem vindo ao ByteBank")
    val Alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome ${Alex.nome}")
    println("Cpf ${Alex.cpf}")
    println("Salário ${Alex.salario}")
    println("Bonificação ${Alex.bonificacao()}")
}



