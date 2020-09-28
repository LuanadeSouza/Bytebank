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
    val documento2: Documento = documento.copy()

    println(alex)
    println(documento)
    println(documento == documento2)
    println(documento2)

}
class Pessoa(var nome: String, val idade: Int) {

    fun fala() {
        println("FALANDO")
    }
}
data class Documento(val rg: String, val cpf: String)
