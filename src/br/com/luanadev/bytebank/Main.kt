package br.com.luanadev.bytebank

fun main() {

    val assistiramCursoAndroid = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = mutableSetOf("Alex", "Paulo", "Maria")
    //val assistiramAmbos=  assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos  = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")

    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract  assistiramCursoKotlin)

    println(assistiramCursoAndroid intersect   assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())


}















