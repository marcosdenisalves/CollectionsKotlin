fun main() {
    val joao = Funcionario(nome = "João", salario = 3500.0, tipoContrato = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 2500.0, tipoContrato = "CLT")
    val eduarda = Funcionario(nome = "Eduarda", salario = 4000.0, tipoContrato = "PJ")
    val denis = Funcionario(nome = "Dênis", salario = 2500.0, tipoContrato = "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(eduarda.nome, eduarda)
    repositorio.create(denis.nome, denis)

//    println(repositorio.findById(eduarda.nome))
    repositorio.findAll().forEach { println(it) }

    println("------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}