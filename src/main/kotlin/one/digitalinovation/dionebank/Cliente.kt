package one.digitalinovation.dionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha : String
) : Pessoa(nome, cpf),Logavel {
    override fun login(): Boolean = "081018" == senha
    override fun toString(): String = """
        Nome: $nome
        CPF:  $cpf
        Tipo: ${clienteTipo.descricao}
        """.trimIndent()
}