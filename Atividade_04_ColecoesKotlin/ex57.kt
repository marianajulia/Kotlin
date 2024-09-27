/*Criar um vetor A do tipo inteiro de 5 elementos
– Solicitar os valores para o usuário e inserir no vetor A
– Criar um vetor B do tipo inteiro
– Ler o vetor A e para cada elemento lido calcular o fatorial e gravar
no B
– Após de todos os elementos do vetor A, mostrar os dois vetores*/

fun main() {
  val A = IntArray(5)
  val B = IntArray(5)

  for (i in 0 until 5) {
      print("Digite o valor ${i + 1} para o vetor A: ")
      A[i] = readLine()?.toIntOrNull() ?: 0
  }

  for (i in A.indices) {
      B[i] = calcularFatorial(A[i])
  }

  println("Vetor A: ${A.joinToString(", ")}")
  println("Vetor B (fatoriais): ${B.joinToString(", ")}")
}

fun calcularFatorial(n: Int): Int {
  if (n < 0) return -1
  if (n == 0 || n == 1) return 1

  var fatorial = 1
  for (i in 2..n) {
      fatorial *= i
  }
  return fatorial
}
