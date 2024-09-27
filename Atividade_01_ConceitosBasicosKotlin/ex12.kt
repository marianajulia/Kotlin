/*Faça um programa na Linguagem Kotlin para efetuar a leitura de um
número inteiro e apresentar o resultado do quadrado desse número.*/

fun main() {

    print("Informe um número inteiro: ")
    val numero = readLine()?.toIntOrNull() ?: 0

    val quadrado = numero * numero

    println("O quadrado de $numero é: $quadrado")
}
