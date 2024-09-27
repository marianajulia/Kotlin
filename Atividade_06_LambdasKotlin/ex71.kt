/*Faça um exemplo utilizando sortedBy*/

class Pessoa(val nome: String, val idade: Int)

fun main() {

    val pessoas = listOf(
        Pessoa("Alice", 30),
        Pessoa("Bob", 25),
        Pessoa("Carlos", 35),
        Pessoa("Diana", 20)
    )


    val pessoasOrdenadas = pessoas.sortedBy { it.idade }


    println("Pessoas ordenadas pela idade:")
    for (pessoa in pessoasOrdenadas) {
        println("${pessoa.nome} - ${pessoa.idade} anos")
    }
}
