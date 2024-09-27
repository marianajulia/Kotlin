/*O cardápio de uma lanchonete é o seguinte:
Especificação Código Preço
Cachorro quente 100 1,20
Bauru simples 101 1,30
Bauru com ovo 102 1,50
Hambúrger 103 1,20
Cheeseburguer 104 1,30
Refrigerante 105 1,00
Faça um programa na Linguagem Kotlin que leia o código do item pedido, a
quantidade e calcule o valor a ser pago por aquele lanche. 
Considere que a cada execução somente será calculado um item.*/

fun main() {
    println("Cardápio da Lanchonete:")
    println("Código | Item                | Preço")
    println("100    | Cachorro quente     | R$ 1,20")
    println("101    | Bauru simples       | R$ 1,30")
    println("102    | Bauru com ovo      | R$ 1,50")
    println("103    | Hambúrguer          | R$ 1,20")
    println("104    | Cheeseburguer      | R$ 1,30")
    println("105    | Refrigerante        | R$ 1,00")


    println("Digite o código do item pedido:")
    val codigo = readLine()?.toIntOrNull()


    println("Digite a quantidade:")
    val quantidade = readLine()?.toIntOrNull() ?: 0


    val preco: Double = when (codigo) {
        100 -> 1.20
        101 -> 1.30
        102 -> 1.50
        103 -> 1.20
        104 -> 1.30
        105 -> 1.00
        else -> {
            println("Código inválido!")
            return 
        }
    }

    val valorTotal = preco * quantidade

    println("O valor a ser pago é: R$ %.2f".format(valorTotal))
}
