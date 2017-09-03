object Main extends App {
  val WATERMELON_CALORIES = 98

  println("Hello, World!")

  println("========= CLASSES AND OBJECTS ==========")
  val r = new Recipe(100)
  println(r.cookTime)
  println("----")
  println(r.cookTime = 2)
  println(r.cookTime)

  println(r.calories)

  val s1 = new Salad(5, 5)
  val s2 = new Salad(15, 15)
  val dinner = new Dinner(List(s1, s2))

  println(s"Number of Menu Items = ${dinner.numberOfMenuItems()}")

  println(WATERMELON_CALORIES)

  val s = Recipe(100) // apply method is called by default
  println(s.calories)

  println("========= TRAITS ==========")
  val g = new GermanGreetings
  println(g.sayHello) //outputs Guten Tag
  println(g.defaultHello) //outputs Hello

  val j = new JapaneseGreetings with DefaultGreetings
  println(j.sayHello) //outputs konnichiwa
  println(j.defaultHello) //outputs Hello

  println("========= FUNCTIONS ==========")
  //creates a function that takes an Int as a parameter and returns
  // Int.The variable type in Scala is formally declared
  val succ = (foo: Int) => {
    foo + 1
  }

  println(succ(10)) //outputs 11
  val c = succAndLog(10, (i: Int) => i + 1) //increment 10 and returns

  def succAndLog(someInt: Int, succ: Int => Int) = {
    println(s"Incrementing $someInt")
    succ(someInt)
  }

  println(c)

  val y = 'Ya
  println(y) //output 'Y
  println(y.getClass) //outputs class scala.Symbol

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

}