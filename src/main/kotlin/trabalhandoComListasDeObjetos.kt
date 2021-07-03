fun main() {
    val joao = Funcionario(nome = "João", salario = 3500.0)
    val maria = Funcionario(nome = "Maria", salario = 2500.0)
    val eduarda = Funcionario(nome = "Eduarda", salario = 4000.0)

    val funcionarios = listOf(joao, maria, eduarda)
    funcionarios.forEach({ println(it) })

    println("================")
    println(funcionarios.find { it.nome == "Eduarda" })

    println()
    println("================")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            
        """.trimIndent()
}