/*Numa pesquisa realizada com um grupo de pessoas pretende-se relacionar as pessoas que têm altura acima da média das pessoas pesquisadas. Elaborar um procedimento para armazenar as alturas e os nomes das pessoas em vetores distintos e exibir a altura média e os nomes das pessoas com altura maior do que a altura média. Encerrar a entrada de dados ao ser digitado o valor 0 para a altura. Cada vetor pode ter no máximo 20 ocorrências.*/

fun main() {
  val alturas = mutableListOf<Double>()
  val nomes = mutableListOf<String>()
  var totalAltura = 0.0

  for (i in 1..20) {
    println("Digite a altura da ${i}ª pessoa (ou 0 para encerrar): ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    if (altura == 0.0) {
      break
    }

    println("Digite o nome da ${i}ª pessoa: ")
    val nome = readLine() ?: "Desconhecido"

    alturas.add(altura)
    nomes.add(nome)
    totalAltura += altura

    }

  val alturaMedia = if (alturas.isNotEmpty()) totalAltura / alturas.size else 0.0
  println("\nAltura média do grupo: %.2f".format(alturaMedia))

  println("Pessoas com altura acima da média:")
  for (i in alturas.indices) {
    if (alturas[i] > alturaMedia) {
      println("${nomes[i]} com altura de ${alturas[i]}")
    }
  }
}


