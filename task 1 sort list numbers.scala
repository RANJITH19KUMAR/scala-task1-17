object SortNumbers {
  def main(args: Array[String]): Unit = {
    val numbers = List(8, 2, 6, 4, 0)
    val sortedNumbers = numbers.sorted

    println("Original list: " + numbers.mkString(", "))
    println("Sorted list: " + sortedNumbers.mkString(", "))
  }
}
