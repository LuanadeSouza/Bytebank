package br.com.luanadev.bytebank.modelo.funcionario

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}