/* Faça um programa na Linguagem Kotlin para calcular e apresentar o
valor do volume de uma lata de óleo, utilizando a fórmula:
VOLUME <-- 3.14159 * RAIO2* ALTURA. */

fun main(){
  var raio : Double
  var altura : Double
  var volume : Double

  println("Digite o valor do raio da lata: ")
  raio = readLine().toString().toDouble()

  println("Digite o valor da altura da lata: ")
  altura = readLine().toString().toDouble()

  volume = 3.14159 * raio *raio * altura

  println("O volume da lata é $volume")
}

