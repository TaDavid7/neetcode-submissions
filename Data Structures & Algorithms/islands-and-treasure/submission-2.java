public class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int r = 0; r<n; r++){
            for(int c = 0; c<m; c++){
                if(grid[r][c] == 0){
                    q.offer(new int[]{r,c});
                }
            }
        }
        if(q.size() == 0) return;
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while(!q.isEmpty()){
            int[] top = q.poll();
            int row = top[0];
            int col = top[1];
            for(int[] d: dir){
                int nr = row + d[0];
                int nc = col + d[1];
                if(nr < 0 || nr>=grid.length || nc<0 || nc>=grid[0].length || grid[nr][nc] != Integer.MAX_VALUE){
                    continue;
                }
                q.add(new int[]{nr,nc});
                grid[nr][nc] = grid[row][col] + 1;
            }
        }
    }
}