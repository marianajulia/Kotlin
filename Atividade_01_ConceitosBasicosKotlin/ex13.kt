/*Faça um programa na Linguagem Kotlin que receba um número e
mostre o resto da divisão por 6.*/

fun main(){
  println("Informe um número: ")
  var num = readLine()?.toIntOrNull() ?: 0

  var resto = num % 6

  println("O resto da divisão de $num por 6 é: $resto")
}