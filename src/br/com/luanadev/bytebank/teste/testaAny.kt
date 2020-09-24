package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.cliente.Endereco

fun testaAny(){
    val endereco = Endereco()

    val objeto: Any = Any()

    imprime(Any())
    imprime(1)
    imprime(1.0)
    val teste = imprime(endereco)
    println(teste)


}

fun imprime(valor: Any): Any {
    println(valor)
    return valor

}
