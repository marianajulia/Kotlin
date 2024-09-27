/*Faça um programa na Linguagem Kotlin que efetue a leitura de cinco
números inteiros e identificar o maior e o menor valor. Não execute a ordenação
de valores.*/

fun main() {
    var maior: Int
    var menor: Int

    println("Digite o primeiro valor: ")
    val a = readLine()?.toIntOrNull() ?: 0

    println("Digite o segundo valor: ")
    val b = readLine()?.toIntOrNull() ?: 0

    println("Digite o terceiro valor: ")
    val c = readLine()?.toIntOrNull() ?: 0

    println("Digite o quarto valor: ")
    val d = readLine()?.toIntOrNull() ?: 0

    println("Digite o quinto valor: ")
    val e = readLine()?.toIntOrNull() ?: 0


    maior = a
    menor = a

    if (b > maior) {
        maior = b
    }
    if (b < menor) {
        menor = b
    }

    if (c > maior) {
        maior = c
    }
    if (c < menor) {
        menor = c
    }

    if (d > maior) {
        maior = d
    }
    if (d < menor) {
        menor = d
    }

    if (e > maior) {
        maior = e
    }
    if (e < menor) {
        menor = e
    }

    println("Maior valor: $maior")
    println("Menor valor: $menor")
}
