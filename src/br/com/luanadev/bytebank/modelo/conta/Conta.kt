package br.com.luanadev.bytebank.modelo.conta

import br.com.luanadev.bytebank.exception.FalhaAutenticacaoException
import br.com.luanadev.bytebank.exception.SaldoInduficienteException
import br.com.luanadev.bytebank.modelo.cliente.Cliente
import br.com.luanadev.bytebank.modelo.funcionario.Autenticavel

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel by titular{
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor ){
            throw SaldoInduficienteException(mensagem = "Saldo insuficiente: $saldo")
        }
        if (!autentica(senha)){
            throw FalhaAutenticacaoException()
        }
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
        }
    }
}