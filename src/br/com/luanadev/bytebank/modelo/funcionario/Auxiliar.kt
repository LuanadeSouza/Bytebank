package br.com.luanadev.bytebank.modelo.funcionario

class Auxiliar(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            return salario * 0.05
        }
}