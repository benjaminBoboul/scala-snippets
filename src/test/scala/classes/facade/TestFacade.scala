package classes.facade

import org.scalatest.{FlatSpec, Matchers}

class TestFacade extends FlatSpec with Matchers {

  "Facade" should "be able too use defined methods" in {
    val computer = new ComputerFacade()
    computer.powerOn()
  }

}
