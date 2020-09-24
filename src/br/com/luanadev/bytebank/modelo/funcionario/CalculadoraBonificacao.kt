package br.com.luanadev.bytebank.modelo.funcionario

class CalculadoraBonificacao {

    var total = 0.0
    private set

    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }
}
