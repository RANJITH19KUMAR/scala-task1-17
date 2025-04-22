object ListReverser {
  def reverseList(nums: List[Int]): List[Int] = {
    nums.reverse
  }
  def main(args: Array[String]): Unit = {
    val originalList = List(1, 2, 3, 4, 5)
    val reversedList = reverseList(originalList)
    println(s"Original List: ${originalList.mkString(", ")}")
    println(s"Reversed List: ${reversedList.mkString(", ")}")
  }
}
