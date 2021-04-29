package one.digitalinovation.dionebank.testes

import one.digitalinovation.dionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf =  ClienteTipo.pf
    println("------->${pf.name} - ${pf.descricao}")
}