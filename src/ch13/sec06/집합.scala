// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < 집합.scala to run them all at once.

Set(2, 0, 1) +
//scala> res0: scala.collection.immutable.Set[Int] = Set(2, 0, 1)
Set(2, 0, 1) + 4
//scala> res1: scala.collection.immutable.Set[Int] = Set(2, 0, 1, 4)


for (i <- Set(1, 2, 3, 4, 5, 6)) print(i + " ")
//scala> 5 1 6 2 3 4

val weekdays = scala.collection.mutable.LinkedHashSet("Mo", "Tu", "We", "Th", "Fr")
//scala> weekdays: scala.collection.mutable.LinkedHashSet[String] = Set(Mo, Tu, We, Th, Fr)

collection.immutable.SortedSet(1, 2, 3, 4, 5, 6)
//scala> res3: scala.collection.immutable.SortedSet[Int] = TreeSet(1, 2, 3, 4, 5, 6)

val digits = Set(1, 7, 2, 9)
//scala> digits: scala.collection.immutable.Set[Int] = Set(1, 7, 2, 9)

digits contains 0 // false
//scala> res4: Boolean = false

Set(1, 2) subsetOf digits // true

val primes = Set(2, 3, 5, 7)
//scala> primes: scala.collection.immutable.Set[Int] = Set(2, 3, 5, 7)
digits union primes
//scala> res6: scala.collection.immutable.Set[Int] = Set(5, 1, 9, 2, 7, 3)

digits & primes
//scala> res7: scala.collection.immutable.Set[Int] = Set(7, 2)

digits -- primes
//scala> res8: scala.collection.immutable.Set[Int] = Set(1, 9)

