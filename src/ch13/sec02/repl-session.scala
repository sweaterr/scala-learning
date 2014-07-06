// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

val immutableMap: collection.immutable.Map[String, Int] = 
  Map("Hello" -> 42) // Nobody can change it
//scala>      | immutableMap: scala.collection.immutable.Map[String,Int] = Map(Hello -> 42)

val mutableMap = new collection.mutable.HashMap[String, Int]

val map: collection.Map[String, Int] = mutableMap

mutableMap.put("Wilma", 17)
//scala> res0: Option[Int] = None
map.put("Fred", 29) // Error

import scala.collection.mutable

val immutableMap = Map("Hello" -> 42)
//scala> immutableMap: scala.collection.immutable.Map[String,Int] = Map(Hello -> 42)

val mutableMap = new mutable.HashMap[String, Int]
//scala> mutableMap: scala.collection.mutable.HashMap[String,Int] = Map()

def digits(n: Int): Set[Int] =
  if (n < 0) { digits(-n)
  } else if (n < 10) { Set(n)
  } else digits(n / 10) + (n % 10)

digits(1729)
//scala> res2: Set[Int] = Set(1, 7, 2, 9)

