fun main() {

    println("Bem vindo ao ByteBank")

    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(-200.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(350.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferencia da conta da Fran para a conta do Alex")
    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferencia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)


}

class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    val contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
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
        val titular = "Luana $i"
        val numeroConta: Int = 1000 + i
        val saldo = i + 10.0

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