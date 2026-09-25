class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        int[] code = new int[26];
        for(int i = 0; i<strs.length; i++){
            String pos = strs[i];
            for(int j = 0; j < pos.length(); j++){
                int temp = pos.charAt(j) - 'a';
                code[temp]++;
            }
            String key = Arrays.toString(code);
            result.computeIfAbsent(key, k -> new ArrayList<>()).add(pos);
            code = new int[26];
        }
        return new ArrayList<>(result.values());
    }
}
