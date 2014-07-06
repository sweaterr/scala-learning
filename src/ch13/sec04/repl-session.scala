// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

val digits = List(4, 2)
//scala> digits: List[Int] = List(4, 2)

9 :: List(4, 2)
//scala> res0: List[Int] = List(9, 4, 2)

9 :: 4 :: 2 :: Nil
//scala> res1: List[Int] = List(9, 4, 2)

9 :: (4 :: (2 :: Nil))
//scala> res2: List[Int] = List(9, 4, 2)

def sum(lst: List[Int]): Int =
  if (lst == Nil) 0 else lst.head + sum(lst.tail)

sum(List(9, 4, 2))
//scala> res3: Int = 15

def sum(lst: List[Int]): Int = lst match {
  case Nil => 0
  case h :: t => h + sum(t) // h is lst.head, t is lst.tail
}

sum(List(9, 4, 2))
//scala> res3: Int = 15

List(9, 4, 2).sum
//scala> res3: Int = 15
