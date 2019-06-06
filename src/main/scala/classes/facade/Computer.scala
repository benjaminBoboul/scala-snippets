package classes.facade

class CPU {
  def powerOn():Unit = println("Power is on.")
}

class Fan {
  def run():Unit = println("Fan is running.")
}

class Light {
  def flash():Unit = println("Light is flashing.")
}