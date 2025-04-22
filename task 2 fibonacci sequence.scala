object FibonacciGenerator {
  def fibonacciIterative(n: Int): List[Int] = {
    var a = 0
    var b = 1
    var fibList = List[Int]()
    for (_ <- 1 to n) {
      fibList = fibList :+ a
      val temp = a
      a = b
      b = temp + b
    }
    fibList
  }

