/*.Faça um programa na Linguagem Kotlin que receba 2 números e
apresente a multiplicação dos dois números.*/

fun main() {
  var a: Int
  var b: Int

  println("Digite o primeiro valor: ")
  a = readLine().toString().toInt()

  println("Digite o segundo valor: ")
  b = readLine().toString().toInt()

  println("A multiplicação de $a e $b é ${a*b}")
}