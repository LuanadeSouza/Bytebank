package br.com.luanadev.collections.array

fun testaRanger() {
    val serie = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()


    val outrosnumerosPares = 0.until(100) step 2
    for (numerosPar in numerosPares) {
        print("$numerosPar ")
    }
    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val intervalo = 1500..5000
    val salario = 5001
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    } else {
        println("Não está dentro do intervalo")
    }
    println()

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}
