/**
  * @author ryan
  * @since 3/9/17
  */
class Food(calories: Int)
class Salad(val lettuceCalories: Int, val dressingCalories: Int) extends Food(lettuceCalories + dressingCalories)
