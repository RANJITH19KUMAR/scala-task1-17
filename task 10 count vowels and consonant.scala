object VowelConsonantCounter {
  def main(args: Array[String]): Unit = {
    val input = "vowels consonant count!"
    val vowels = Set('a', 'e', 'i', 'o', 'u')
    var vowelCount = 0
    var consonantCount = 0
    for (char <- input.toLowerCase) {
      if (char.isLetter) {
        if (vowels.contains(char)) {
          vowelCount += 1
        } else {
          consonantCount += 1
        }
      }
    }
    println(s"Vowels: $vowelCount")
    println(s"Consonants: $consonantCount")
  }
}
