package one.digitalinovation.dionebank.testes

import one.digitalinovation.dionebank.Analista
import one.digitalinovation.dionebank.Funcionario

fun main() {

    val miguelFuncionario = Analista("Miguel Pereira","49132160828", 1200.0 )
    ImprimeRelatorioFuncionario.imprime(miguelFuncionario)
}
