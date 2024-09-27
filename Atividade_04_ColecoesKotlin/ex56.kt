/*Faça um programa que receba cinco valores e armazene em um vetor. Depois apresente o vetor em ordem crescente numérica.*/

fun main() {
    val valores = IntArray(5)

    for (i in 0 until 5) {
        print("Digite o valor ${i + 1}: ")
        valores[i] = readLine()?.toIntOrNull() ?: 0 
    }

    for (i in 0 until valores.size - 1) {
        for (j in 0 until valores.size - 1 - i) {
            if (valores[j] > valores[j + 1]) {

                val temp = valores[j]
                valores[j] = valores[j + 1]
                valores[j + 1] = temp
            }
        }
    }

    println("Valores em ordem crescente: ${valores.joinToString(", ")}")
}
