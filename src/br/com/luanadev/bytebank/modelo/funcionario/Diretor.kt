package br.com.luanadev.bytebank.modelo.funcionario

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override fun autentica(senha: Int): Boolean {
        return autentica(senha)
    }

    override val bonificacao: Double
        get() {
            return salario + plr
        }


}