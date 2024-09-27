/*Faça um programa na Linguagem Kotlin que efetue a leitura de um número
inteiro e apresentar uma mensagem informando se o número é par ou ímpar.
*/

fun main(){

  println("Digite um valor: ")
  var num = readLine()?.toIntOrNull() ?: 0

  if(num % 2 == 0){
    println("O número $num é par")
  }else{
    println("O número $num é impar")
  }
}