package br.com.luanadev.bytebank.teste

fun testaClasseNumber(){
    val x: Int = 15
    val y: Double = 14.5
    var z = x
    z += 10



    teste(y)
    teste(x)
    teste(z)

    println(x.toDouble())
    println(y.toLong())
    println(z)
}
fun teste(valor: Number){

}