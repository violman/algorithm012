/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

  // ✋
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (null != root) {
      result.add(root.val);
      if (null != root.left)
        result.addAll(preorderTraversal(root.left));
      if (null != root.right)
        result.addAll(preorderTraversal(root.right));
    }
    return result;
  }
}
// @lc code=end
