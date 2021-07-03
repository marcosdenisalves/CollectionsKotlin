fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: %.2f".format(salarios.average()))
    println()

    println("========================")
    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    salariosMaiorQue2500.forEach({ println("Salário filtrado: $it") })

    println("Quantidade de salários entre 2000 e 5000: ${salarios.count {it in 2000.0..5000.0}}")
}