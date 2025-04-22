object PrimeChecker {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      val sqrtN = math.sqrt(n).toInt
      !(3 to sqrtN by 2).exists(n % _ == 0)
    }
  }
  def main(args: Array[String]): Unit = {
    val number = 29  // Change this to any number you want to check
    if (isPrime(number))
     println(s"$number is a prime number.")
    else
     println(s"$number is not a prime number.")
  }
}
