/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
  //✋利用 map;key 记录 nums 的值，value 记录出现的次数
  public int[] intersect(int[] nums1, int[] nums2) {

     int count = 0;
     int[] result = new int[Math.max(nums1.length, nums2.length)];
     Map<Integer, Integer> map = new HashMap<>();
     for (int i = 0; i < nums1.length; i++) {
         map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
     }
     for (int i = 0; i < nums2.length; i++) {
         if (map.containsKey(nums2[i]) && map.getOrDefault(nums2[i], 0) != 0) {
             result[count++] = nums2[i];
             map.put(nums2[i], map.get(nums2[i]) - 1);
         }
     }
     return Arrays.copyOfRange(result, 0, count);

 }
}
// @lc code=end

