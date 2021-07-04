import java.util.*

fun main() {
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2500.0, tipoContrato = "CLT")
    val eduarda = Funcionario(nome = "Eduarda", salario = 4000.0, tipoContrato = "PJ")

//    val funcionarios = mutableListOf(joao, maria)
//
//    funcionarios.forEach { println(it) }
//
//    println("====================")
//    funcionarios.add(eduarda)
//    funcionarios.forEach { println(it) }
//
//    println("====================")
//    funcionarios.remove(joao)
//    funcionarios.forEach { println(it) }

    val funcionarioSet = mutableSetOf(joao)
    println("====================")
    funcionarioSet.forEach { println(it) }

    println("====================")
    funcionarioSet.addAll(Arrays.asList(maria, eduarda))
    funcionarioSet.forEach { println(it) }

    println("====================")
    funcionarioSet.remove(eduarda)
    funcionarioSet.forEach { println(it) }

}
