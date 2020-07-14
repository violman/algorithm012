import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.lang.model.element.Element;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {

  // 暴力求解，两层嵌套循环 ✋
  // public int[] twoSum(int[] nums, int target) {

  //   int[] result = new int[2];
  //   for (int i = 0; i < nums.length - 1; i++) {
  //     for (int j = i + 1; j < nums.length; j++) {
  //       if (target == nums[i] + nums[j]) {
  //         result[0] = i;
  //         result[1] = j;
  //         return result;
  //       }
  //     }
  //   }
  //   return result;
  // }

  // hashmap 求解 ✋✋
  public int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])
      && i != map.get(target - nums[i])) {
        result[0] = i;
        result[1] = map.get(target - nums[i]);
      }
      map.put(nums[i], i);
    }
    return result;
  }
}
// @lc code=end
