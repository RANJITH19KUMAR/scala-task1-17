object MinMaxFinder {
  def findMinAndMax(numbers: List[Int]): (Int, Int) = {
    var min = numbers.head
    var max = numbers.head
    for (num <- numbers.tail) {
      if (num < min) min = num
      if (num > max) max = num
    }
    (min, max)
  }
  def main(args: Array[String]): Unit = {
    val numbers = List(10, 25, -3, 47, 8, 0)
   val (smallest, largest) = findMinAndMax(numbers)
    println(s"List: ${numbers.mkString(", ")}")
    println(s"Smallest number: $smallest")
    println(s"Largest number: $largest")
  }
}
