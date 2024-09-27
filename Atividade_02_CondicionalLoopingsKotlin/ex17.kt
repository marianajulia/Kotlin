/*Faça um programa na Linguagem Kotlin que efetue a leitura de um valor
inteiro positivo ou negativo e apresentar o número lido como sendo um valor
positivo, ou seja, o programa deverá apresentar o módulo de um número
fornecido.*/

fun main(){
  println("Digite um número inteiro (positivo ou negativo):")
  var  numero = readLine()?.toIntOrNull() ?: 0

  var modulo = if (numero < 0) -numero else numero

  println("O valor absoluto do número é: $modulo")
}