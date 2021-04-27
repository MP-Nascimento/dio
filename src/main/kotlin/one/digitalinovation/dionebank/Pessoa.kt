package one.digitalinovation.dionebank

class Pessoa {
    var nome: String = "miguel"
    var cpf: String = "419.321.608-28"

}

fun main() {
    val miguel = Pessoa()
    println(miguel.nome)
    println(miguel.cpf)
}