import java.util._
object EulerMethod {
  def fun(x: Double, y: Double): Double = 1 + x - 8 * y
  def main(args: Array[String]): Unit = {
    var h: Double = 0.0
    var x: Double = 0.0
    var y: Double = 0.0
    var i: Double = 0.0
    var m: Double = 0.0
    var PredelY: Double = 0.0
    x = 1
    y = 1
    PredelY = 4.5
    h = 0.25
    println("x0 = " + x + " y0 = " + y + " h = " + h + " y()=1+x-8*y")
    var Stop:Boolean = true
    val predelX: Double = PredelY
    println("Метод Эйлера")
    i = 0
    while (Stop) {
      if (x < predelX) {
        val pohity: Double = fun(x, y)
        val ZigaY: Double = pohity * h
        println("i = " + i + " x = " + x + " y = " + y + "         y' = " + pohity + "      <>y' = " +
          ZigaY)
        x += h
        y += ZigaY
      }
      else{
        println("i = " + i + " x = " + x + " y = " + y)
        Stop = false
      }
      { i += 1; i - 1 }
    }
    println("End")
    new Scanner(System.in).nextLine()
  }
}
