package br.com.luanadev.collections

import br.com.luanadev.collections.list.*


fun main() {

    val livros = mutableListOf(livro1, livro2, livro3, livro4)
    livros.add(
        Livro(
            titulo = "Sagrana",
            autor = " João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    livros.imprimeComMarcadores()
    livros.remove(livro1)
    livros.imprimeComMarcadores()

    val ordenAnoPublicacao = livros.sorted()
    ordenAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.autor }

    println(titulos)
}

fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de Lvros ### \n$textoFormatado")
}















