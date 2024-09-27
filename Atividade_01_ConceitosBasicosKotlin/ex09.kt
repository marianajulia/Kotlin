/*Faça um programa na Linguagem Kotlin para efetuar o cálculo e a
apresentação do valor de uma prestação em atraso, utilizando a
fórmula PRESTAÇÃO <-- VALOR + (VALOR * (TAXA/100) *
TEMPO).*/

fun main(){
  var valor: Double
  var taxa: Double
  var tempo: Double

  println("Valor original da prestação: ")
  valor = readLine().toString().toDouble()

  println("Taxa de juros: ")
  taxa = readLine().toString().toDouble()

  println("Tempo em meses de atraso: ")
  tempo = readLine().toString().toDouble()

  var prestacao = valor + (valor * (taxa/100) * tempo)

  println("O valor da prestação em atraso é: R$%.2f".format(prestacao))
}