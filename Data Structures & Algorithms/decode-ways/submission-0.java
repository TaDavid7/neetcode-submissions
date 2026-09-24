class Solution {
    public int numDecodings(String s) {
        Map<Integer, Integer> mem = new HashMap<>();
        mem.put(s.length(), 1);
        return dfs(s, 0, mem);
    }

    private int dfs(String s, int i, Map<Integer, Integer> mem){
        if(mem.containsKey(i)){
            return mem.get(i);
        }
        if(s.charAt(i) == '0'){
            return 0;
        }
        int result = dfs(s, i+1, mem);
        if (i + 1 < s.length() && (s.charAt(i) == '1' ||
           s.charAt(i) == '2' && s.charAt(i + 1) < '7')) {
            result += dfs(s, i + 2, mem);
        }
        mem.put(i, result);
        return result;
    }
}
