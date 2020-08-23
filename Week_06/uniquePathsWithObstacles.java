/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {

  //✋ 状态 由 二维降为一维
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {

      int width = obstacleGrid[0].length;
      int[] dp = new int[width];
      dp[0] = 1;
      for (int[] row : obstacleGrid) {
          //注意：从 0 开始 遍历
          for (int i = 0; i < width; i++) {

              if (row[i] == 1) {
                  dp[i] = 0;
              } else if (i > 0) {
                  dp[i] += dp[i - 1];
              }
          }
      }
      return dp[width - 1];

  }
}
// @lc code=end
