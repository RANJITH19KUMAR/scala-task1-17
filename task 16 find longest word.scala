object Top3LongestWords {
  def main(args: Array[String]): Unit = {

    val words = Seq("apple", "banana", "kiwi", "strawberry", "grapefruit", "fig", "mango")
    
    val top3 = words.sortBy(-_.length).take(3)

    println("Original Words:")
    println(words.mkString(", "))

    println("\nTop 3 Longest Words:")
    println(top3.mkString(", "))
  }
}
