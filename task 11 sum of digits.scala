object DigitSum {
  def main(args: Array[String]): Unit = {
    val number = 97885
    val sum = sumOfDigits(number)
    println(s"Sum of digits in $number is: $sum")
  }
  def sumOfDigits(n: Int): Int = {
    n.abs.toString.map(_.asDigit).sum
  }
}
