fun main() {

    for (i in 5..1) {

        val titular: String = "Luana $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("Titular $titular")
        println("Número da conta:  $numeroConta")
        println("Saldo da conta: $saldo")
        println()


//   testaCondicoes(saldo)

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
}