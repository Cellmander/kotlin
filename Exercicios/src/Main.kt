fun main() {

    fun lerNota(numero: Int): Float {
        while (true) {
            print("Digite a $numero º nota: ")
            val entrada = readLine()?.toFloatOrNull()
            if (entrada != null && entrada in 0.0..10.0){
                return entrada
            }
            println("Entrada inválida! Insira uma nota entre 0 e 10.")
        }
    }

    val nota1 = lerNota(1)
    val nota2 = lerNota(2)
    val nota3 = lerNota(3)
    val nota4 = lerNota(4)

    val media = (nota1 + nota2 + nota3 + nota4)/4
    println("Sua média é %.2f".format(media))
    if (media < 7){
        println("Reprovado!")
    }else{
        println("Aprovado!")
    }

}