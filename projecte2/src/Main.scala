object Main {
  def main(args: Array[String]):Unit={
    println("Entra dos números")
    var variable1 =Integer.valueOf(readLine())
    var variable2 = Integer.valueOf(readLine())
    println("suma "+ suma(variable1, variable2))
    println("resta "+ resta(variable1, variable2))
    println("mult "+ mult(variable1, variable2))
    println("div "+ div(variable1.floatValue(), variable2.floatValue()))

  }

  def suma(a: Int, b: Int):Int={
    return a+b
  }
  def resta (c:Int, d: Int):Int={
    return c-d
  }

  def mult (c:Int, d: Int):Int={
    return c*d
  }

  def div (c:Float, d: Float):Float={
    return c/d
  }

}
