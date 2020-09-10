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