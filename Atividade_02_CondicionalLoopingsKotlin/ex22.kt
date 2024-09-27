/*Faça um programa na Linguagem Kotlin que leia 3 números inteiros e mostre
o maior deles.*/

fun main() {
    var maior: Int

    println("Digite o primeiro valor: ")
    val a = readLine()?.toIntOrNull() ?: 0

    println("Digite o segundo valor: ")
    val b = readLine()?.toIntOrNull() ?: 0

    println("Digite o terceiro valor: ")
    val c = readLine()?.toIntOrNull() ?: 0

    maior = if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }

    println("Maior valor: $maior")
}
