import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

  // BFS 要点：每次把添加一层的数据的同时一次性取一层
  public List<List<Integer>> levelOrder(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();

    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {

      List<Integer> list = new ArrayList<>();
      int size = nodes.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = nodes.poll();
        list.add(node.val);
        if (node.left != null) {
          nodes.add(node.left);
        }
        if (node.right != null) {
          nodes.add(node.right);
        }
      }

      result.add(list);

    }

    return result;
  }

  // DFS 要点：每次把添加一层的数据的同时一次性取一层
  public List<List<Integer>> levelOrder1(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();
    if (root == null)
      return result;
    travel(root, 0, result);
    return result;
  }

  public void travel(TreeNode root, int level, List<List<Integer>> result) {

    if (result.size() == level) {
      result.add(new ArrayList<>());
    }
    result.get(level).add(root.val);
    if (root.left != null) {
      travel(root.left, level + 1, result);
    }
    if (root.right != null) {
      travel(root.right, level + 1, result);
    }

  }

}
// @lc code=end
