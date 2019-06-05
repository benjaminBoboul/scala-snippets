package classes

abstract class Meal {
  def eat(): String = {
    "burp."
  }
}

case class Sandwich() extends Meal

object CaseClassWithAbstractParent {

}
