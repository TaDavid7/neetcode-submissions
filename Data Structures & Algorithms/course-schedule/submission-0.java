class Solution {
    private Map<Integer, List<Integer>> pre = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i = 0; i<numCourses; i++){
            pre.put(i, new ArrayList<>());
        }
        for(int[] prereq : prerequisites){
            pre.get(prereq[0]).add(prereq[1]);
        }
        for(int c = 0; c<numCourses; c++){
            if(!dfs(c)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int c){
        if(visited.contains(c)){
            return false;
        }
        if(pre.get(c).isEmpty()){
            return true;
        }
        visited.add(c);
        for(int p: pre.get(c)){
            if(!dfs(p)){
                return false;
            }
        }
        visited.remove(c);
        pre.put(c, new ArrayList<>());
        return true;
    }
}
