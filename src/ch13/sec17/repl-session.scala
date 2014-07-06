// These are meant to be typed into the REPL. You can also run
// scala -Xnojline < repl-session.scala to run them all at once.

val coll = (1 to 1000000).map(BigInt(_))

coll.par.sum

coll.par.count(_ % 2 == 0)

for (i <- (0 until 100).par) print(i + " ")
//0 1 2 3 4 5 25 12 13 14 15 6 50 7 16 26 17 8 51 9 18 27 19 10 52 11 20 28 21 53 22 29 23 54 24 30 37 55 38 31 39 56 40 32 41 57 42 33 43 58 44 34 45 59 46 35 47 60 48 36 49 61 62 63 75 76 77 87 64 88 78 89 65 90 79 91 66 92 80 93 67 94 81 95 68 96 82 97 69 98 83 99 70 84 71 85 72 86 73 74

for (i <- (0 until 100).par) yield i + " "

// Don't do this:

var count = 0
for (c <- coll.par) { if (c % 2 == 0) count += 1 }
count


// Associative fold and aggregate

val str = (1 to 1000).par.map(_.toString).fold("")(_ + _)
str.par.aggregate(Set[Char]())(_ + _, _ ++ _)
