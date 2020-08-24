/*
 * @lc app=leetcode.cn id=547 lang=java
 *
 * [547] 朋友圈
 */

// @lc code=start
class Solution {

  // ✋并查集
  public class UnionFind{
      int count = 0;
      int[] parent;
      public UnionFind(int count){
          this.count = count;
          parent = new int[count];
          for (int i = 0; i < parent.length; i++) {
              parent[i] = i;
          }
      }

      private void union(int p, int q){
          if (find(p) != find(q)) {
              parent[find(p)] = find(q);
              count--;
          }
      }
      private int find(int p) {
          while (p != parent[p]) {
              p = parent[parent[p]];
          }
          return p;
      }
  }

  public int findCircleNum(int[][] M) {

    
      int n = M.length;
      UnionFind unionFind = new UnionFind(n);
      for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
              if (M[i][j] == 1) {
                  unionFind.union(i, j);
              }
          }
      }
      return unionFind.count;

  }
}
// @lc code=end

