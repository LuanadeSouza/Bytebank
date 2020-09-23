package br.com.luanadev.bytebank.modelo.funcionario

class CalculadoraBonificacao {

    var total = 0.0
    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }
//    fun registra(gerente: br.com.luanadev.bytebank.modelo.funcionario.Gerente) {
//        this.total += gerente.bonificacao
//    }
//    fun registra(diretor: br.com.luanadev.bytebank.modelo.funcionario.Diretor) {
//        this.total += diretor.bonificacao
//    }

}
