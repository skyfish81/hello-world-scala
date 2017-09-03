println("========= COLLECTIONS ==========")
val marks = IndexedSeq(50, 70, 65) // creates an index sequence
val numbers1 = Vector(11, 22, 33) //creates sequence of numbers
val languages = Set("Scala", "Haskell", "Java")
val nameAndGrades = Map("John" -> 'C, "Steve" -> 'A, "Mary" -> 'B)

val range = 0 to 10 // range of all the numbers from 0 to 10

//transform all the elements of the collection
val xs = Vector(10, 20, 30, 40)
val newList = xs.map(x => x / 2)

println(newList)
println(xs)

//filtering
val ys = Vector(1, 2, 3, 4, 5).filter(x => x < 3)
println(ys)

//grouping elements of collections based on the return value
val groupByOaddAndEven = Vector(1, 2, 3, 4, 5).groupBy(x => x % 2 == 0)
println(groupByOaddAndEven) //outputs Map(false -> Vector(1, 3, 5), true -> Vector(2, 4))

//sorting
val lowestToHighest = Vector(3, 1, 2).sorted
println(lowestToHighest)

//mutable
val numbers = scala.collection.mutable.ListBuffer(10, 20, 30)
numbers(0) = 40
println(numbers) //outputs ListBuffer(40, 20, 30)

// foldLeft
// (Apply binary operation op between successive elements of xs,
// going from left to right and starting with z as initial value.)
val x = Traversable(1, 2, 3, 4)
// sum all the numbers
x.foldLeft(0) { (a, e) => a + e } // can be replaced with x.sum

//parallel
val numbers3 = scala.collection.parallel.ParSeq(1, 2, 3, 4, 5, 6, 7)
val newNumbers3 = numbers3.map { x =>
  println(s"Current thread ${Thread.currentThread.getName}")
  x + 1
}