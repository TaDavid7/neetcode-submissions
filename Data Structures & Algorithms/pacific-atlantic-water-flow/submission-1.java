class Solution {
    private int[][] directions = {{1, 0}, {-1, 0},
                                  {0, 1}, {0, -1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int n = heights.length;
        int m = heights[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        for(int r = 0; r<n; r++){
            dfs(heights, r, 0, pacific);
            dfs(heights, r, m-1, atlantic);
        }
        for(int c = 0; c<m; c++){
            dfs(heights, 0, c, pacific);
            dfs(heights, n-1, c, atlantic);
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }
    private void dfs(int[][] heights, int r, int c, boolean[][] ocean){
        ocean[r][c] = true;
        for (int[] d : directions) {
            int nr = r + d[0], nc = c + d[1];
            if (nr >= 0 && nr < heights.length &&
                nc >= 0 && nc < heights[0].length &&
                !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]) {
                dfs(heights, nr, nc, ocean);
            }
        }
    }
}
