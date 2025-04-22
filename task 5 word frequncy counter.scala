object WordCounter {
  def countWords(text: String): Map[String, Int] = {
    text
      .toLowerCase
      .split("\\W+")               
      .filter(_.nonEmpty)          
      .groupBy(identity)           
      .view.mapValues(_.length)    
      .toMap
  }
  def main(args: Array[String]): Unit = {
    val inputText = "Scala is fun. Scala is powerful. Functional programming in Scala is great!"
    val wordCounts = countWords(inputText)
    println("Word Frequency Count:")
    wordCounts.foreach { case (word, count) =>
      println(s"$word: $count")
    }
  }
}
