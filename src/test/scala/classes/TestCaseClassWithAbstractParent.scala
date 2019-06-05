package classes

import org.scalatest._

class TestCaseClassWithAbstractParent extends FlatSpec with Matchers {

  "A case class wich extends abstract class" should "inherit methods" in {
    val repas = Sandwich()
    repas.eat() shouldEqual "burp."
  }

}
