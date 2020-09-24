package br.com.luanadev.bytebank.modelo.funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int = 0
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {
    override val bonificacao: Double
        get() {
            return salario * 0.10
        }
    override fun autentica(senha: Int): Boolean = this.senha == senha

}