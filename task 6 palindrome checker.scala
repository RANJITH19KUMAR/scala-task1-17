object PalindromeChecker {
  def isPalindrome(text: String): Boolean = {
    val cleaned = text.toLowerCase.replaceAll("[^a-z0-9]", "")
    cleaned == cleaned.reverse
  }
  def main(args: Array[String]): Unit = {
    val input = "Madam"  // You can change this string
    if (isPalindrome(input))
      println(s"'$input' is a palindrome.")
    else
      println(s"'$input' is not a palindrome.")
  }
}
