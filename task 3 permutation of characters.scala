object WordPermutations {
  def getPermutations(str: String): List[String] = {
    if (str.length == 1) List(str)
    else {
      for {
        i <- str.indices.toList
        ch = str(i)
        rest = str.take(i) + str.drop(i + 1)
        perm <- getPermutations(rest)
      } yield ch + perm
    }
  }
  def main(args: Array[String]): Unit = {
    val word = "cat"  // Change this to any word you like
    val permutations = getPermutations(word)
    println(s"Permutations of '$word':")
    permutations.foreach(println)
  }
}
