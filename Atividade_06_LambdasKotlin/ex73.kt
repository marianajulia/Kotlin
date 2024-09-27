/*Faça um exemplo utilizando reduce*/

fun main() {
  val numeros = listOf(1, 2, 3, 4, 5)
  val soma = numeros.reduce { acumulador, numero -> acumulador + numero }
  println("A soma dos números é: $soma")
}
