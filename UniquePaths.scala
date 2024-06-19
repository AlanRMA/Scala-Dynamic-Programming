// https://leetcode.com/problems/unique-paths/

//Approach:
// I realized that the number of paths from top left to bottom right is equal to the number of paths
// from top left to bottom left times the number of paths from top left to top right
// So I just need to find the factorial of the number of rows and columns


import scala.math._

object Solution {
  def uniquePaths(m: Int, n: Int): Int = {
    (factorial(n + m - 2) / (factorial(m - 1) * factorial(n - 1))).toInt
  }
}