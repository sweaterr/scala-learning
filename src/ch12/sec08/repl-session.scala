// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

def mul(x: Int, y: Int) = x * y //mul: (x: Int, y: Int)Int

def mulOneAtATime(x: Int) = (y: Int) => x * y //scala> mulOneAtATime: (x: Int)Int => Int

mulOneAtATime(6)(7) // scala> res0: Int = 42

def mulOneAtATime(x: Int)(y: Int) = x * y //scala> mulOneAtATime: (x: Int)(y: Int)Int

val a = Array("Hello", "World") //scala> a: Array[String] = Array(Hello, World)
val b = Array("hello", "world") //scala> b: Array[String] = Array(hello, world)
a.corresponds(b)(_.equalsIgnoreCase(_)) //scala> res1: Boolean = true


