fun main() {

    println("Bem vindo ao ByteBank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.saldo = 200.0
//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)


    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

}

fun testaLacos() {
    var i = 0
    while (i < 5) {

        val titular = "Luana $i"
        val numeroConta = 1000 + i
        val saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta:  $numeroConta")
        println("Saldo da conta: $saldo")
        println()
        i++
    }
    for (i in 5 downTo 1 step 2) {
        val titular: String = "Luana $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta:  $numeroConta")
        println("Saldo da conta: $saldo")
        println()
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta com saldo: $saldo")
    } else if (saldo == 0.0) {
        println("Conta com saldo: $saldo")
    } else {
        println("Conta com saldo: $saldo.")
    }

    when {
        saldo > 0.0 -> println("Conta com saldo: $saldo ")
        saldo == 0.0 -> println("Conta com saldo: $saldo")
        else -> println("Conta com saldo: $saldo")
    }


}