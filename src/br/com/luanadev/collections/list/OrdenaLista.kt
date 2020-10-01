package br.com.luanadev.collections.list

fun ordenaLista() {
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

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    val titulos = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.autor }

    println(titulos)

}