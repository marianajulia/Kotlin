/*Faça um programa na Linguagem Kotlin que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente. */

fun main() {

    println("Digite o primeiro número:")
    val num1 = readLine()?.toIntOrNull() ?: 0

    println("Digite o segundo número:")
    val num2 = readLine()?.toIntOrNull() ?: 0

    println("Digite o terceiro número:")
    val num3 = readLine()?.toIntOrNull() ?: 0

    var menor: Int
    var meio: Int
    var maior: Int


    if (num1 <= num2 && num1 <= num3) {
        menor = num1
        if (num2 <= num3) {
            meio = num2
            maior = num3
        } else {
            meio = num3
            maior = num2
        }
    } else if (num2 <= num1 && num2 <= num3) {
        menor = num2
        if (num1 <= num3) {
            meio = num1
            maior = num3
        } else {
            meio = num3
            maior = num1
        }
    } else {
        menor = num3
        if (num1 <= num2) {
            meio = num1
            maior = num2
        } else {
            meio = num2
            maior = num1
        }
    }

    println("Os números em ordem crescente são: $menor, $meio, $maior")
}
