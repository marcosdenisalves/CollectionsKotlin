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