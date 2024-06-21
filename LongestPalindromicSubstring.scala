//https://leetcode.com/problems/longest-palindromic-substring/description/

//Approach:

// Find the longest palindromic substring in all substrings
object Solution {

  def longestPalindrome(s: String): String = {
    if (s.isEmpty) return ""

    val n = s.length
    val dp = Array.ofDim[Boolean](n, n)
    var start = 0
    var maxLength = 1

    for (i <- 0 until n) {
      dp(i)(i) = true
    }

    for (i <- 0 until n - 1) {
      if (s(i) == s(i + 1)) {
        dp(i)(i + 1) = true
        start = i
        maxLength = 2
      }
    }

    for (length <- 3 to n) {
      for (i <- 0 to n - length) {
        val j = i + length - 1
        if (dp(i + 1)(j - 1) && s(i) == s(j)) {
          dp(i)(j) = true
          start = i
          maxLength = length
        }
      }
    }

    s.substring(start, start + maxLength)
  }

  // Exemplo de uso
  def main(args: Array[String]): Unit = {
    val sequencia = "fweffababbabadababefeff"
    println("O maior palíndromo é: " + longestPalindrome(sequencia))
  }
}
