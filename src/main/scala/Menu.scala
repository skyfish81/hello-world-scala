/**
  * @author ryan
  * @since 3/9/17
  */
// Example of Overriding Methods
class Menu(items: List[Food]) {
  def numberOfMenuItems() = items.size
}

// Dinner only consists of Salads
class Dinner(items: List[Salad]) extends Menu(items) {
  override def numberOfMenuItems(): Int = 2 * items.size
}