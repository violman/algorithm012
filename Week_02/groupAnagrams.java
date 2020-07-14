import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.awt.www.content.audio.basic;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {

    // ✋
    // 维护一个 的 List<Integer> 用来存添加过 result 的 strs 的index;
    // 遍历的时候判断一下，已经添加过的 continue
    // public List<List<String>> groupAnagrams(String[] strs) {

    // List<List<String>> result = new ArrayList<>();
    // List<Integer> addedList = new ArrayList<>();

    // for (int i = 0; i < strs.length; i++) {
    // List<String> list = new ArrayList<String>();
    // if (!addedList.contains(i)) {
    // list.add(strs[i]);
    // } else {
    // continue;
    // }
    // for (int j = i + 1; j < strs.length; j++) {
    // if (validAnagram(strs[i], strs[j])) {
    // list.add(strs[j]);
    // addedList.add(j);
    // }
    // }
    // result.add(list);
    // }

    // return result;

    // }

    // public boolean validAnagram(String s, String t) {

    // if (s.length() != t.length())
    // return false;
    // char[] str1 = s.toCharArray();
    // char[] str2 = t.toCharArray();
    // Arrays.sort(str1);
    // Arrays.sort(str2);
    // return Arrays.equals(str1, str2);
    // }

    // ✋✋解法2 ：利用 Map<String, List<String>>
    // public List<List<String>> groupAnagrams(String[] strs) {
    // if (strs.length == 0)
    // return new ArrayList();
    // Map<String, List<String>> map = new HashMap<>();
    // for (int i = 0; i < strs.length; i++) {
    // char[] s = strs[i].toCharArray();
    // Arrays.sort(s);
    // String string = String.valueOf(s);
    // if (!map.containsKey(string)) {
    // map.put(string, new ArrayList<>());
    // }
    // map.get(string).add(strs[i]);
    // }
    // return new ArrayList<>(map.values());
    // }

    // ✋✋解法3 ：利用 字母的 count
    // public List<List<String>> groupAnagrams(String[] strs) {
    // if (null == strs || strs.length == 0)
    // return new ArrayList();
    // Map<String, List<String>> map = new HashMap<>();
    // for (int i = 0; i < strs.length; i++) {
    // char[] count = new char[26];
    // for (char c : strs[i].toCharArray()) {
    // count[c - 'a']++;
    // }
    // String string = String.valueOf(count);
    // if (!map.containsKey(string)) {
    // map.put(string, new ArrayList<>());
    // }
    // map.get(string).add(strs[i]);
    // }
    // return new ArrayList<>(map.values());
    // }

    //✋✋✋
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char [] count = new char[26];
            char [] c = strs[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                count[c[j] - 'a']++;
            }
            if (null == map.get(String.valueOf(count)))
                map.put(String.valueOf(count), new ArrayList<>());
            map.get(String.valueOf(count)).add(strs[i]);
        }
        return new ArrayList<>(map.values());

    }

}
// @lc code=end
