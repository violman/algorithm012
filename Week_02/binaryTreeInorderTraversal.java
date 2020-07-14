import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */

class Solution {

    //✋ 二叉树遍历一般用递归
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null != root) {
            if (null != root.left)
                result.addAll(inorderTraversal(root.left));
            result.add(root.val);
            if (null != root.right)
                result.addAll(inorderTraversal(root.right));
        }
        return result;
    }
}
// @lc code=end
