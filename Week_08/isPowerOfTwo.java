/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂
 */

// @lc code=start
class Solution {

  //✋
  public boolean isPowerOfTwo(int n) {

      int count = 0;
      if (n < 0) {
          return false;
      }
      while(n != 0) {
          n = n & (n-1);
          count++;
      }
      return count==1;
  }
}
// @lc code=end

