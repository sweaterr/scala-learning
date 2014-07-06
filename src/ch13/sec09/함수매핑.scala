// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < 함수매핑.scala to run them all at once.

val names = List("Peter", "Paul", "Mary")

names.map(_.toUpperCase) // List("PETER", "PAUL", "MARY")

for (n <- names) yield n.toUpperCase

def ulcase(s: String) = Vector(s.toUpperCase(), s.toLowerCase())
//scala> ulcase: (s: String)scala.collection.immutable.Vector[String]

names.map(ulcase)
//scala> res2: List[scala.collection.immutable.Vector[String]] =
// List(Vector(PETER, peter), Vector(PAUL, paul), Vector(MARY, mary))

names.flatMap(ulcase)
//scala> res3: List[String] = List(PETER, peter, PAUL, paul, MARY, mary)

"-3+4".collect { case '+' => 1 ; case '-' => -1 }
//scala> res4: scala.collection.immutable.IndexedSeq[Int] = Vector(-1, 1)

// 함수의 사이드 이펙트를 위해 함수를 적요하고 싶고, 함수 값에 대해 신경 쓰지 않는다면, foreach를 사용한다
names.foreach(println)


