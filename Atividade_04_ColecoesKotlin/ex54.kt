/*Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.
*/

fun main(){
  var A = mutableListOf<Double>()
  var B = mutableListOf<Double>()

  for(i in 1..5){
    println("Digite a nota da 1º prova do $i º aluno : ")
    var valorp1 = readLine()?.toDoubleOrNull() ?: 0.0
    A.add(valorp1)

    println("Digite a nota da 2º prova do $i º aluno: ")
    var valorp2 = readLine()?.toDoubleOrNull() ?: 0.0
    B.add(valorp2)
  }

  for(i in 0 until 5){
    var media = (A[i] + B[i]) / 2
    println("Média do ${i + 1}º aluno é $media")
  }

}