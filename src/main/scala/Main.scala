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

  val s1 = new Salad(5,5)
  val s2 = new Salad(15,15)
  val dinner = new Dinner(List(s1,s2))

  println(s"Number of Menu Items = ${dinner.numberOfMenuItems}")

  println(WATERMELON_CALORIES)

  val s = Recipe(100) // apply method is called by default
  println(s.calories)

}