/*Faça um programa na Linguagem Kotlin que que receba um número e mostre
o fatorial desse número. */

fun main(){

  println("Informe um valor: ")
  var num = readLine()?.toIntOrNull() ?: -1

  if (num < 0) {
      println("Por favor, insira um número inteiro não negativo.")
      return
  }

  var fatorial = 1
  for(i in 1..num){
    fatorial = fatorial * i
  }
  println("O fatorial de $num é: $fatorial")

}