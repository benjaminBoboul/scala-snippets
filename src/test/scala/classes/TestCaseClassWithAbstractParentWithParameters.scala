package classes

import org.scalatest.{FlatSpec, Matchers}

class TestCaseClassWithAbstractParentWithParameters extends FlatSpec with Matchers {

  "Case class with abstract parent with parameters" should "use default value for parameters" in {
    val boisson = Soda()
    boisson.sugarValue shouldBe 10
  }
  it should "update parameters if defined" in {
    val boisson = Soda(20.0)
    boisson.sugarValue shouldBe 20
  }
}
