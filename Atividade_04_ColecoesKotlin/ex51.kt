/*Criar uma coleção “A” na linguagem Kotlin com 10 elementos
– Inserir os elementos de 1 a 10 na coleção
– Criar uma outra coleção B que conterá o elemento da coleção A
multiplicado por 2
– Mostrar as duas coleções
Obs. Não efetuar a leitura de 10 elementos*/

fun main(){
  val A = List(10) {it + 1}
  val B = mutableListOf<Int>()

  for (i in A){
    B.add(i*2)
  }

  println("Coleção A: $A")
  println("Coleção B: $B")

}