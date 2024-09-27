/*Faça um programa na Linguagem Kotlin que calcule a área da
circunferência.*/

import kotlin.math.PI

fun main(){
  var raio : Double

  println("Digite o valor do raio: ")
  raio = readLine().toString().toDouble()

  println("A area da circunferência é ${raio*raio*PI}")


}