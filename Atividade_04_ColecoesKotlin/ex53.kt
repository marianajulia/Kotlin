/*Faça uma rotina para obter dez números inteiros, armazená-los em um
vetor e escrevê-los na ordem inversa de sua leitura. Utilize uma única saída.
*/

fun main(){
  var numeros = IntArray(10)

  for (i in 0 until 10){
    println("Digite ${i + 1}º valor: ")
    numeros[i] = readLine()?.toIntOrNull() ?: 0
  }

  print("Números na ordem inversa: ")
  for (i in 9 downTo 0){
    print("${numeros[i]}\t")
  }

}