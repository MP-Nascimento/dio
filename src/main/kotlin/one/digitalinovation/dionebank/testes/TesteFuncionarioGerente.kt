package one.digitalinovation.dionebank.testes
import one.digitalinovation.dionebank.Gerente

fun main() {
    val diegoFuncionario = Gerente("Diego Candido", "07045223498", 5000.0,"524019")
    ImprimeRelatorioFuncionario.imprime(diegoFuncionario)
    TesteAutenticacao().autentica( diegoFuncionario )
}

