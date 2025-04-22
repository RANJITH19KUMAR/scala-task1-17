object CharCount {
  def main(args: Array[String]): Unit = {
    val inputString = "Scala programming language"
    val targetChar = 'a'

    val count = inputString.count(_ == targetChar)

    println(s"Input String: $inputString")
    println(s"Character to count: '$targetChar'")
    println(s"Number of occurrences: $count")
  }
}
