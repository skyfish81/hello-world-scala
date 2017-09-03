/**
  * @author ryan
  * @since 3/9/17
  */
class Recipe(val calories: Int) {
  println(s"Created recipe with ${calories} calories")
  var cookTime: Int = _ // sets 0, default value of Int

  // declares method that returns an Int - Int return is optional
  def estimatedEffort(servings: Int): Int = {
    println("estimating the effort...")
    servings * cookTime * calories
  }
}
