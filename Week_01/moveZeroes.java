public class moveZeroes {
  /*
   * @lc app=leetcode.cn id=283 lang=java
   *
   * [283] 移动零
   */
  // @lc code=start

  // ✋✋
  public void moveZeroes1(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[j++] = nums[i];
      }
    }

    while (j < nums.length) {
      nums[j++] = 0;
    }
  }

  void moveZeroes(int[] nums) {

    for (int j = 0, i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        if (i != j) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
        j++;
      }
    }
  }
}
// @lc code=end
