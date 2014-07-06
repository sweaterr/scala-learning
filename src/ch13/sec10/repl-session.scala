// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

List(1, 7, 2, 9).reduceLeft(_ - _)
//res6: Int = -17

List(1, 7, 2, 9).reduceRight(_ - _)
// 1 - (7 - (2 - 9))
//res7: Int = -13

List(1, 7, 2, 9).foldLeft(0)(_ - _)
//res8: Int = -19

(0 /: List(1, 7, 2, 9))(_ - _)

val freq = scala.collection.mutable.Map[Char, Int]()
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1
//freq: scala.collection.mutable.Map[Char,Int] = Map(M -> 1, s -> 4, p -> 2, i -> 4)

(Map[Char, Int]() /: "Mississippi") {
  (m, c) => m + (c -> (m.getOrElse(c, 0) + 1))
}

(1 to 10).scanLeft(0)(_ + _)
//res10: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55)
