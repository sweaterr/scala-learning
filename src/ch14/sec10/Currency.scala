package ch14.sec10

abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount

object Main extends App {
  val amt = Currency(29.95, "EUR")
  val price = amt.copy(value = 19.95)
  println(price) //Currency(19.95,EUR)
  println(amt.copy(unit = "CHF")) //Currency(29.95,CHF)

}
