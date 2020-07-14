public class Solution {
  /*
   * @lc app=leetcode.cn id=66 lang=java
   *
   * [66] 加一
   */

  // @lc code=start
  //✋
  // public int[] plusOne(int[] digits) {
  //   for (int i = digits.length - 1; i >= 0; i--) {
  //     if (digits[i] < 9) {
  //       digits[i]++;
  //       return digits;
  //     }
  //     digits[i] = 0;
  //   }
  //   digits = new int[digits.length + 1];
  //   digits[0] = 1;
  //   return digits;
 
  // }

  //✋✋
  public int[] plusOne(int[] digits) {
    
      for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }  
        digits[i] = 0;
      }
      digits = new int[digits.length + 1];
      digits[0] = 1;
      return digits;

  }


  // @lc code=end

}