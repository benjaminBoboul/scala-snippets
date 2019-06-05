package classes

object ImplicitClassSuperRichString {
  implicit class SuperRichString(in:String) {
    def world:String = in+", world"
  }
  def main(args: Array[String]): Unit = {
    println("Hello" world)
    println("Good night" world)
  }
}
