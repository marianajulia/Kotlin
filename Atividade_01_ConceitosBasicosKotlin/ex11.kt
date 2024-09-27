/*Faça um programa na Linguagem Kotlin para ler dois valores inteiros
para as variáveis A e B e efetuar a troca dos valores de forma que a
variável A passe a possuir o valor da variável B e a variável B passe
a possuir o valor da variável A. Apresentar os valores trocados.*/

fun main(){

  println("Informe o valor de A: ")
  var A = readLine()?.toIntOrNull() ?: 0

  println("Informe o valor de B: ")
  var B = readLine()?.toIntOrNull() ?: 0

  val temp = A
  A = B 
  B = temp

  println("Valores após a troca: A = $A, B = $B")
}