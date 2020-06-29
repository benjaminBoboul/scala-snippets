// This is called curring
val g = (x:Int) => (y:Int) => (z:Int) => x+y+z

val h = g(10)
val i = h(20) // or g(10)(20)
val j = i(30) // or h(20)(30) or g(10)(20)(10)

def f(x:Int)(op:(int)=>int):int = op(x)

f(10)(x=>x+1) // Int = 11

f(10)(x=>println(x);x+1) // Don't work

f(10) {
  println(x)
  x+1
} // print then return 11

f(if (true) 10 else 20)(_+1) // Int = 11

// to defer expression evaluation
def f(x:=>Int)(op:(int)=>int):int = op(x)

f(10+10)(_+1) // the expression 10+10 won't be computed until op's call.

