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
    println("Bonificação ${Alex.bonificacao}")

    val fran = Gerente(
        nome= "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("Nome ${fran.nome}")
    println("Cpf ${fran.cpf}")
    println("Salário ${fran.salario}")
    println("Bonificação ${fran.bonificacao}")
    if (fran.autentica(1234)){
        println("Autenticou com sucesso ")
    }else{
        println("Falha na autenticação")
    }
    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.33-33",
        salario = 4000.0,
        senha = 12345,
        plr = 200.0
    )
    println("Nome ${gui.nome}")
    println("Cpf ${gui.cpf}")
    println("Salário ${gui.salario}")
    println("Bonificação ${gui.bonificacao}")
    println("Bonificação ${gui.plr}")
    if (gui.autentica(12345)){
        println("Autenticou com sucesso ")
    }else{
        println("Falha na autenticação")
    }
}



