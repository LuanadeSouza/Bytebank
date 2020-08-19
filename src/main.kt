fun main(){

    //var multavel, val imutavel
    val titular: String = "Luana"
    val numeroConta: Int = 1000
    var saldo = 0.0
//    saldo = 100.0 + 2.0
//    saldo += 200
//    saldo -= 1000

    println("Titular $titular")
    println("Número da conta:  $numeroConta")
    println("Saldo da conta: $saldo")


//   testaCondicoes(saldo)

}

fun testaCondicoes(saldo: Double){
    if (saldo > 0.0){
        println("Conta com saldo: $saldo")
    }else if (saldo == 0.0){
        println("Conta com saldo: $saldo")
    }else{
        println("Conta com saldo: $saldo.")
    }

    when {
        saldo > 0.0 -> println("Conta com saldo: $saldo ")
        saldo == 0.0 -> println("Conta com saldo: $saldo")
        else -> println("Conta com saldo: $saldo")
    }

}