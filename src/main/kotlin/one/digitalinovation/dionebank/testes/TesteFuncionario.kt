package one.digitalinovation.dionebank.testes

import one.digitalinovation.dionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val miguel = one.digitalinovation.dionebank.Pessoa("Miguel","49132160828")
    println(miguel.nome)
    println(miguel.cpf)

    val miguelFuncionario= Funcionario("Miguel Pereira","49132160828", BigDecimal.valueOf(12000) )
    println("Nome: ${miguelFuncionario.nome}  CPF: ${miguelFuncionario.cpf}")
    println("Salario: ${miguelFuncionario.salario}")

}