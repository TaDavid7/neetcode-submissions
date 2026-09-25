class Solution {
    int[][] mem;
    public int uniquePaths(int m, int n) {
        mem = new int[m][n];
        for(int[] x: mem){
            Arrays.fill(x, -1);
        }
        return dfs(0, 0, m, n);
    }

    private int dfs(int i, int j, int m, int n){
        if(i == (m-1) && j == (n-1)){
            return 1;
        }
        if(i>=m || j>= n) return 0;
        if(mem[i][j] != -1){
            return mem[i][j];
        }
        mem[i][j] = dfs(i, j+1, m, n) + dfs(i+1, j, m, n);
        return mem[i][j];
    }
}
