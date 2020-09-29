package br.com.luanadev.bytebank.teste

import java.io.File
import java.io.FileNotFoundException


fun ler() {
    try {
        File("lista-desejos.txt").forEachLine(action = ::println)
    } catch (e: FileNotFoundException) {
        println("Falha ao ler o arquivo");
        e.printStackTrace();
    }

}