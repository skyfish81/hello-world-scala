object Main extends App {
  println("Hello, World!")

  val r = new Recipe(100)
  println(r.cookTime)
  println("----")
  println(r.cookTime = 2)
//  println(r.calories)
  println(r.cookTime)

  println(r.calories)
}