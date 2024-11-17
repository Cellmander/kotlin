
fun main() {
    println("Insira o valor do produto: ")
    val valorProduto = readLine()?.toFloatOrNull() ?: run {
        println("Opção inválida, definindo valor como 0.")
        0f
    }

    println("Insira a opção de pagamento: ")
    println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto")
    println("2 - À Vista no cartão de crédito, recebe 10% de desconto")
    println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros")
    println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%")
    val opcao = readLine()?.toIntOrNull() ?: run {
        println("Opção inválida! definindo como pagamento à vista")
        1
    }

    val valorTotal = when (opcao){
        1 -> {
            println("Pagamento à vista no dinheiro ou pix! Aplicando 15% de desconto.")
            valorProduto - (valorProduto * 0.15)
        }
        2 -> {
            println("Pagamento à vista no cartão! Aplicando 10% de desconto.")
            valorProduto - (valorProduto * 0.1)
        }
        3 -> {
            println("Pagamento parcelado em 2x!")
            valorProduto
        }
        4 -> {
            println("Pagamento parcelado em 3x ou mais! Aplicando juros de 10%")
            valorProduto + (valorProduto * 0.1)
        }
        else -> {
            println("Opção inválida! Nenhum desconto ou juros aplicado")
            valorProduto
        }
    }
    println("Valor total a pagar: R$ %.2f".format(valorTotal))
}