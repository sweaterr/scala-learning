// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

val lst = scala.collection.mutable.LinkedList(1, -7, 2, -9)
var cur = lst
while (cur != Nil) {
  if (cur.elem < 0) cur.elem = 0
  cur = cur.next
}

lst
//scala> res1: scala.collection.mutable.LinkedList[Int] = LinkedList(1, 0, 2, 0)

var cur = lst
while (cur != Nil && cur.next != Nil) {
  cur.next = cur.next.next
  cur = cur.next
}

lst
//scala> res3: scala.collection.mutable.LinkedList[Int] = LinkedList(1, 2)

// Remove everything starting from the first negative number

import scala.collection.mutable.LinkedList

val lst = LinkedList(1, 7, -2, 9)

var cur = lst
while (cur != Nil && cur.next != Nil) {
  if (cur.next.elem < 0)
    cur.next = LinkedList.empty // DO NOT set to null
  cur = cur.next
}

lst
//scala> res5: scala.collection.mutable.LinkedList[Int] = LinkedList(1, 7)





