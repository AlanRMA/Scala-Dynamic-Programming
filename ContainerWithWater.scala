//https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75


//approach: two pointers technique

class Solution {
  def maxArea(height: List[Int]): Int = {
    var left = 0
    var right = height.length - 1
    var maxArea = 0
    
    while (left < right) {
      // Calculate current area
      val currentArea = math.min(height(left), height(right)) * (right - left)
      // Update max area if necessary
      maxArea = math.max(maxArea, currentArea)
      
      // Move pointers
      if (height(left) < height(right)) {
        left += 1
      } else {
        right -= 1
      }
    }
    
    maxArea
  }
}
