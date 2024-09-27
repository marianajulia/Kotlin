/*Faça um programa na Linguagem Kotlin que leia quatros valores referentes
a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o
aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição*/

fun main() {

    println("Digite a primeira nota:")
    val nota1 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Digite a segunda nota:")
    val nota2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Digite a terceira nota:")
    val nota3 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Digite a quarta nota:")
    val nota4 = readLine()?.toDoubleOrNull() ?: 0.0

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >= 7) {
        println("Aluno aprovado com média: $media")
    } else {
        println("Aluno reprovado com média: $media")
    }
}
