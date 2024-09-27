/*Faça um programa na Linguagem Kotlin que leia a idade de uma
pessoa expressa em ano, mês e dia e mostre-as em dias.*/

fun main(){
  var ano: Int
  var meses: Int
  var dias: Int
  var idadeFinal: Int

  println("Digite sua idade em anos: ")
  ano = readLine().toString().toInt()

  println("Digite sua idade em meses: ")
  meses = readLine().toString().toInt()

  println("Digite sua idade em dias: ")
  dias  = readLine().toString().toInt()

  idadeFinal = (ano * 365) + (meses * 30) + dias 


  println("Sua idade em dias é ${idadeFinal} ")
}