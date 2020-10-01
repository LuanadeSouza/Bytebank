package br.com.luanadev.collections

import br.com.luanadev.collections.list.*


fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
}
















