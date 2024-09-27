/*Faça um exemplo uma variável do tipo função anônima */

val somar: (Int, Int) -> Int = {a, b -> a + b}

fun main(){
  val resultado = somar(5, 3)
  println("O resultado da soma é: $resultado")
}