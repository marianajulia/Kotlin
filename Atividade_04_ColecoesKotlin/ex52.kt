/*Criar uma coleção A na Linguagem Kotlin com 5 elementos do tipo inteiro
– Solicitar os valores para o usuário e inserir na coleção A
– Após a inserção mostrar a coleção A*/

fun main(){
  val A = mutableListOf<Int>()

  for(i in 1..5){
    println("Digite $i º valor: ")
    var valor = readLine()?.toIntOrNull() ?: 0
    A.add(valor)
  }
  print("Coleção A: $A")
}