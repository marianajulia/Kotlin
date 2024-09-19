/*Faça um programa na Linguagem Kotlin que leia uma temperatura
em graus Fahrenheit e apresentá-la convertida em graus Celsius. A
formula de conversão é C <-- (F - 32) * (5/9), sendo f a temperatura
em Fahrenheit e C a temperatura em Celsius.*/

fun main(){
  var C: Double
  var F: Double

  println("Digite a temperatura em Fahrenheit: ")
  F = readLine().toString().toDouble()

  C = (F-32.0)*(5.0/9.0)

  println("A temperatira em Celsius é $C")
}