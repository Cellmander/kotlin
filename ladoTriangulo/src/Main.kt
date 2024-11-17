
fun main() {

    fun lerValorLado(numero: Int): Int {
        while (true) {
            println("Digite a medida do lado $numero: ")
            val lado = readLine()?.toIntOrNull()
            if (lado != null && lado >= 1){
                return lado
            }
            println("Medida inválida! Digite um número inteiro maior que 0.")
        }
    }

    val lado1 = lerValorLado(1)
    val lado2 = lerValorLado(2)
    val lado3 = lerValorLado(3)

    if (lado1 == lado2 && lado1 == lado3){
        println("Triângulo Equilátero")
    }else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
        println("Triângulo Escaleno")
    }else {
        println("Triâgulo Isósceles")
    }
}