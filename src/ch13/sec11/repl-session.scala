// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)

prices zip quantities
//res11: List[(Double, Int)] = List((5.0,10), (20.0,2), (9.95,1))

(prices zip quantities) map { p => p._1 * p._2 }
//res12: List[Double] = List(50.0, 40.0, 9.95)

((prices zip quantities) map { p => p._1 * p._2 }) sum
//res13: Double = 99.95

List(5.0, 20.0, 9.95) zip List(10, 2)
//res14: List[(Double, Int)] = List((5.0,10), (20.0,2))

List(5.0, 20.0, 9.95).zipAll(List(10, 2), 0.0, 1)
//res15: List[(Double, Int)] = List((5.0,10), (20.0,2), (9.95,1))

"Scala".zipWithIndex

"Scala".zipWithIndex.max

"Scala".zipWithIndex.max._2


