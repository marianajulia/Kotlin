/*Criar uma coleção na linguagem Kotlin com 20 elementos
- Inserir somente os pares começando de 10
- após a inserção dos elementos, mostrar a coleção
Obs. Não efetuar a leitura de 20 elementos*/

fun main() {
  val pares = List(20) {10 + it * 2}
  println(pares)
}
