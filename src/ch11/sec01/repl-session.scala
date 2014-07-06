// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.
package ch11.sec01



object Main extends App {
  val √ = scala.math.sqrt _

  √(2)

  val `val` = 42

  println(`val`)
}