package one.digitalinovation.dionebank

 class  Pessoa{
    var nome: String = "miguel"
    var cpf: String = "419.321.608-28"
    private  set
     constructor()
     fun  pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val miguel = one.digitalinovation.dionebank.Pessoa()
    println(miguel.pessoaInfo())

}