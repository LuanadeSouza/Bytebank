package br.com.luanadev.bytebank.teste

fun testaDataClass() {

    val alex = Pessoa(
        nome = "Alex",
        idade = 25
    )
    alex.fala()
    val documento = Documento(
        rg = "12345678-9",
        cpf = "123.456.789-01"
    )
    println(alex)
    println(documento)

}
class Documento(val rg: String, val cpf: String)
