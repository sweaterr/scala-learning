package ch08.sec10

// Compile without, then with -Xcheckinit

class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

class Ant extends Creature {
  override val range = 2
}

class Bug extends {
  override val range = 3
} with Creature

//class Cow extends Creature {
//  override lazy val range = 4
//}

object Main extends App {
  val 개미 = new Ant
  println(개미.range)
  println(개미.env.length)

  val 벌레 = new Bug
  println(벌레.range)
  println(벌레.env.length)

//  val 소 = new Cow
//  println(b.range)
//  println(b.env.length)
}
