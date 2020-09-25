package br.com.luanadev.bytebank.teste

fun testaString() {

    val p1 = Pessoa(nome = "Alex", idade = 5)
    var p2 = p1
    p2.nome = "Fran"

    println(p1.nome)
    println(p2.nome)

    val palavra = "palavra"
    var palavraNova = "palavra"
    palavraNova = "palavraNova"

    val substring = palavra.substring(4)

    println(palavra)
    println(palavraNova)
    println(substring)

    for (c in palavra) {
        println(c == 'a')
    }
}
    class Pessoa(var nome: String, val idade: Int) {

        fun fala() {
            println("emite som")
        }
    }
