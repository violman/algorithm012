import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {

    //✋
    // public boolean isAnagram(String s, String t) {
    //     if (s.length() != t.length()) return false;
    //     char[] str1 = s.toCharArray();
    //     char[] str2 = t.toCharArray();
    //     Arrays.sort(str1);
    //     Arrays.sort(str2);
    //     return Arrays.equals(str1, str2);
    // }
    
    //✋✋
    public boolean isAnagram(String s, String t) {

      Map<Character, Integer>  map = new HashMap<>();
      if (s.length() != t.length()) return false;
      for (int i = 0; i < s.length(); i++) {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
      }
      Iterator<Integer> iterator = map.values().iterator();
      while(iterator.hasNext()) {
          if (iterator.next() != 0) return false;
      }
      return true;
    }
    
}
// @lc code=end

