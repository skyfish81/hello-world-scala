/**
  * @author ryan
  * @since 3/9/17
  */
trait Greetings {
  def sayHello: String
}

trait DefaultGreetings {
  def defaultHello = "Hello"
}

class JapaneseGreetings extends Greetings {
  override def sayHello: String = "konnichiwa"
}

class GermanGreetings extends Greetings with DefaultGreetings {
  override def sayHello: String = "Guten Tag"
}


