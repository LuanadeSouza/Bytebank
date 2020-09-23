package br.com.luanadev.bytebank.modelo.conta

import br.com.luanadev.bytebank.modelo.cliente.Cliente

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor){
            this.saldo -= valor
        }    }
}