
object RemoveDuplicates {
  def main(args: Array[String]): Unit = {
    val originalList = List(1, 2, 2, 3, 4, 4, 5, 1, 6)

    // Remove duplicates using distinct
    val uniqueList = originalList.distinct

    println("Original List:")
    println(originalList)

    println("List after removing duplicates:")
    println(uniqueList)
  }
}
