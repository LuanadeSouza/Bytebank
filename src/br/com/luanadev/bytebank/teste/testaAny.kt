package br.com.luanadev.bytebank.teste

import br.com.luanadev.bytebank.modelo.cliente.Endereco

fun testaAny(){
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep = "00000-000"
    )
    println(endereco.equals(enderecoNovo))
    println(endereco.equals(endereco))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())


}

fun imprime(valor: Any): Any {
    println(valor)
    return valor

}
