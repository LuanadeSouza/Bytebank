package funcionario

class CalculadoraBonificacao {

    var total = 0.0
    fun registra(funcionario: Funcionario) {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }
//    fun registra(gerente: funcionario.Gerente) {
//        this.total += gerente.bonificacao
//    }
//    fun registra(diretor: funcionario.Diretor) {
//        this.total += diretor.bonificacao
//    }

}
