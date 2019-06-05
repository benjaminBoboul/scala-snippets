package classes

abstract class Lunch() {
  def eat(): String = {
    "burp."
  }
  def sugarValue:Double
}

case class Soda(sugarValue:Double = 10.0) extends Lunch

object CaseClassWithAbstractParentWithParameters {

}
