/* Faça um programa na Linguagem Kotlin que leia tenha 3 opções:
 1 - Fatorial
 2 - Quadradro de um número
 3 - Volume de uma lata
 4 – Sair do Programa
Utilize os conceitos de funções em Kotlin*/

import kotlin.math.PI

fun main(){
while(true){
    println("Escolha uma opção: ")
    println("1- Fatorial")
    println("2- Quadrado de um numero")
    println("3- Volume de uma lata")
    println("4- Sair do programa")

    var numOption = readLine().toString().toInt()
    when(numOption){
        1 -> {
            println("Digite um valor:")
            var num = readLine().toString().toInt()
            println("O valor do fatorial de $num é ${fatorial(num)}")
        }

        2 -> {
            println("Digite um valor: ")
            var num = readLine().toString().toInt()
            println("O quadrado de $num é ${quadradoNumero(num)}")
        } 

        3 -> {
            println("Digite o valor do raio: ")
            var raio = readLine().toString().toDouble()
            println("Digite o valor da altura: ")
            var altura = readLine().toString().toDouble()

            println("O volume da lata é ${volumeLata(raio,altura)}")
        }

        4 -> {
            println("Saindo do programa...")
            break
        }

        else -> {
            println("Opção invalida")
        }
    }
}
}


fun fatorial(num:Int):Int{
    var resultado:Int = 1
    for( i in 1..num){
        resultado = resultado * i
}
    return resultado
}

fun quadradoNumero(num:Int):Int{
    return num * num
}

fun volumeLata(raio:Double, altura:Double):Double{
    return PI * raio * raio * altura
}