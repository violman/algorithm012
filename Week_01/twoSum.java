import java.util.Arrays;

import javax.lang.model.element.Element;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class twoSum {

  // 暴力求解，两层嵌套循环 ✋
  public int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (target == nums[i] + nums[j]) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

}
// @lc code=end
