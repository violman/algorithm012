import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {


    //✋  利用 Map 来记录所有节点值的父节点，利用 Set 来记录 P 节点的从叶到根的父节点
    
    private Map<Integer, TreeNode> parent = new HashMap<>();
    private Set<Integer> visitedNode = new HashSet<>();

    public void dfs(TreeNode root) {

        if (null == root) {
            return;
        }
        if (null != root.left) {
            parent.put(root.left.val, root);
            dfs(root.left);
        }
        if (null != root.right) {
            parent.put(root.right.val, root);
            dfs(root.right);
        }

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root);
        while(null != p) {
            visitedNode.add(p.val);
            p = parent.get(p.val);
            
        }
        while(null != q){
            if (visitedNode.contains(q.val)) return q;
            q = parent.get(q.val);
        }
        return null;
    }
}
// @lc code=end

