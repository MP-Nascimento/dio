package one.digitalinovation.dionebank.testes

import one.digitalinovation.dionebank.Bank

fun main() {
    val digOneBank = Bank(nome="DigOne",numero = 12)
    val banco2 = digOneBank.copy("DioTwo")
  println(banco2.info())
}