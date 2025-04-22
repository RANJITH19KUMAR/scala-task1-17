object SimpleCalculator {
  def add(a: Double, b: Double): Double = a + b
  def main(args: Array[String]): Unit = {
    val num1 = 10.5
    val num2 = 4.5
    val result = add(num1, num2)
    println(s"The sum of $num1 and $num2 is $result")
  }
}
