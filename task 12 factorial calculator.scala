object FactorialLoop {
  def main(args: Array[String]): Unit = {
    val number = 5
    println(s"Factorial of $number is: ${factorial(number)}")
  }
  def factorial(n: Int): BigInt = {
    var result = BigInt(1)
    for (i <- 2 to n) {
    result *= i
    }
    result
  }
}
