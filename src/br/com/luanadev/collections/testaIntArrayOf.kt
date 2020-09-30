package br.com.luanadev.collections

fun testaIntAraayOf() {
    val idades = intArrayOf(20, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("Maior idade: ${maiorIdade}")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("Menor idade: ${menorIdade}")
}
