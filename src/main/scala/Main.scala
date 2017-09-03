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

}