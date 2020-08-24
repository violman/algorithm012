/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {

  //✋ 
  public class UnionFind {
      private int count = 0;
      private int[] parent;

      public UnionFind(char[][] grid) {

          int m = grid.length;
          int n = grid[0].length;
          parent = new int[m * n];
          for (int i = 0; i < m; i++) {
              for (int j = 0; j < n; j++) {
                  if (grid[i][j] == '1') {

                      //需保证唯一性
                      parent[i * n + j] = i * n + j;
                      count++;
                  }
              }
          }
      }

      private int find(int p) {
          int root = p;
          while (root != parent[root]) {
              root = parent[parent[root]];
          }
          while (parent[p] != root) {
              int i = parent[p];
              p = i;
              parent[p] = root;
          }
          return root;
      }

      private void union(int p, int q) {

          int rootP = find(p);
          int rootQ = find(q);
          if (rootP != rootQ) {
              parent[rootP] = rootQ;
              count--;
          }
      }

  }

  public int numIslands(char[][] grid) {

      if (grid == null || grid.length == 0 || grid[0].length == 0) {
          return 0;
      }
      //由于是从上到下，所以 distance 只需要判断 向右和向下就可以了
      int[][] distance = { { 1, 0 }, { 0, 1 } };
      int rows = grid.length;
      int cols = grid[0].length;
      UnionFind unionFind = new UnionFind(grid);
      for (int i = 0; i < rows ;i++) {
          for (int j = 0; j < cols; j++) {
              if (grid[i][j] == '1') {

                  for (int[] js : distance) {
                      int x = js[0] + i;
                      int y = js[1] + j;
                      if (x < rows && x >= 0 && y < cols && y >= 0 && grid[x][y] == '1') {
                          unionFind.union(i * cols + j, x * cols + y);
                      }
                  }
              }
          }

      }
      return unionFind.count;
  }
}
// @lc code=end
