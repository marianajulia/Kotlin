/*Faça um programa na Linguagem Kotlin que efetue a apresentação
do valor da conversão em real de um valor lido em dólar. O programa
deve solicitar o valor da cotação do dólar e também a quantidade de
dólares disponível com o usuário, para que seja apresentado o valor
em moeda brasileira.*/

fun main(){

  println("Informe a cotação do dólar: ")
  var cotacaoDolar = readLine()?.toDoubleOrNull() ?: 0.0

  println("Informe a quantidade de dólares disponível: ")
  var quantidadeDolares = readLine()?.toDoubleOrNull() ?: 0.0

  var valorEmReais = quantidadeDolares * cotacaoDolar

  println("O valor em reais é: R$%.2f" .format(valorEmReais))
}