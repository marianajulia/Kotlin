/*. Fazer um programa para ler os dados de um funcionário (nome, salário
Bruto e Desconto). Em seguida, mostrar os dados do funcionário (nome e
salário líquido). Em seguida, aumentar o salário do funcionário com base
em uma porcentagem dada e mostrar novamente os dados do
funcionário.*/

class Funcionario(
  var nome: String,
  var salarioBruto: Double,
  var desconto: Double
){

  fun salarioLiquido(): Double{
    return salarioBruto - desconto
  }

  fun aumentarSalario(porcentagem: Double) {
      val aumento = salarioBruto * (porcentagem / 100)
      salarioBruto += aumento 
  }

  fun exibirDados() {
    println("Nome: $nome")
    println("Salário Líquido: R$ ${"%.2f".format(salarioLiquido())}")
  }
}

fun main(){
  println("Digite o nome do funcionário:")
  val nome = readLine()!!

  println("Digite o salário bruto do funcionário:")
  val salarioBruto = readLine()!!.toDouble()

  println("Digite o desconto do funcionário:")
  val desconto = readLine()!!.toDouble()

  val funcionario = Funcionario(nome, salarioBruto, desconto)

  println("\nDados do Funcionário:")
  funcionario.exibirDados()

  println("Digite a porcentagem de aumento:")
  val porcentagem = readLine()!!.toDouble()
  funcionario.aumentarSalario(porcentagem)

  println("\nDados do Funcionário Após Aumento:")
  funcionario.exibirDados()
}