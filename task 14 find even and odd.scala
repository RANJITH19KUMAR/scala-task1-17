object EvenOddSeparator {

  def separateEvenOdd(numbers: List[Int]): (List[Int], List[Int]) = {
    val evens = numbers.filter(_ % 2 == 0)
    val odds = numbers.filter(_ % 2 != 0)
    (evens, odds)
  }

  
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val (evens, odds) = separateEvenOdd(numbers)

    println(s"Original List: $numbers")
    println(s"Even Numbers: $evens")
    println(s"Odd Numbers: $odds")
  }
}
