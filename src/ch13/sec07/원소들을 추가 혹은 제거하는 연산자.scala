// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < 원소들을 추가 혹은 제거하는 연산자.scala to run them all at once.
/**
 * 읿반적으로 +는 순서가 없는 콜렉션에 원소를 추가하는 데 사용되고
 * +:와 :+는 순서가 있는 콜렉션에 원소를 시작 혹은 끝에 더한
 */
Vector(1, 2, 3) :+ 5
//scala> res0: scala.collection.immutable.Vector[Int] = Vector(1, 2, 3, 5)

1 +: Vector(1, 2, 3)
//scala> res1: scala.collection.immutable.Vector[Int] = Vector(1, 1, 2, 3)


import scala.collection.mutable.ArrayBuffer

val numbers = ArrayBuffer(1, 2, 3)
//scala> numbers: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

numbers += 5
//scala> res2: numbers.type = ArrayBuffer(1, 2, 3, 5)

var numbers = Set(1, 2, 3)
numbers += 5 // Sets numbers to the immutable set numbers + 5

Set(1, 2, 3) - 2
//scala> res4: scala.collection.immutable.Set[Int] = Set(1, 3)


numbers ++ Vector(1, 2, 7, 9)
//scala> res5: scala.collection.immutable.Set[Int] = Set(5, 1, 9, 2, 7, 3)

numbers -- Vector(1, 2, 7, 9)
//scala> res6: scala.collection.immutable.Set[Int] = Set(3, 5)

