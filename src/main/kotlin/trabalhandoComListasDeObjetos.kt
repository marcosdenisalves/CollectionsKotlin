fun main() {
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2500.0, tipoContrato = "CLT")
    val eduarda = Funcionario(nome = "Eduarda", salario = 4000.0, tipoContrato = "PJ")

    val funcionarios = listOf(joao, maria, eduarda)
//    funcionarios.forEach({ println(it) })
//
//    println("================")
//    println(funcionarios.find { it.nome == "Eduarda" })

    println()
    println("================")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }
}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            Tipo de Contráto: $tipoContrato
            
        """.trimIndent()
}