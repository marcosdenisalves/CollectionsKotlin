fun main() {
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2500.0, tipoContrato = "CLT")
    val eduarda = Funcionario(nome = "Eduarda", salario = 4000.0, tipoContrato = "PJ")

    val funcionario1 = setOf(joao, eduarda)
    val funcionario2 = setOf(maria)

//    val result = funcionario1.union(funcionario2)
//    result.forEach({ println(it) })
//
//    println()
//    println("==================")
    var funcionario3 = setOf(joao, maria, eduarda)
    val result2 = funcionario3.subtract(funcionario2)
    result2.forEach({ println(it) })

    println()
    println("==================")
    val resultInteScet = funcionario3.intersect(funcionario2)
    resultInteScet.forEach({ println(it) })
}