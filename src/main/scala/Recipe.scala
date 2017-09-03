/**
  * @author ryan
  * @since 3/9/17
  */

object Recipe {
  // assume the client was only guessing the calories and double just in case
  def apply(calories: Int) = new Recipe(calories * 2)
}

class Recipe(val calories: Int) {
  println(s"Created recipe with ${calories} calories")
  var cookTime: Int = _ // sets 0, default value of Int

  // declares method that returns an Int - Int return is optional
  def estimatedEffort(servings: Int): Int = {
    println("estimating the effort...")
    servings * cookTime * calories
  }
}
