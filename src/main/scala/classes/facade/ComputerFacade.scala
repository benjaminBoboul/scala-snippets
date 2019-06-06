package classes.facade

class ComputerFacade {
  private val cpu = new CPU
  private val fan = new Fan
  private val light = new Light

  def powerOn():Unit = {
    cpu.powerOn()
    fan.run()
    light.flash()
  }
}