package one.digitalinovation.dionebank.testes

import com.sun.security.ntlm.Client
import one.digitalinovation.dionebank.Cliente
import one.digitalinovation.dionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "José da silva",
        cpf = "111.333.222.44",
        clienteTipo = ClienteTipo.pf,
        senha = "081018"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}

