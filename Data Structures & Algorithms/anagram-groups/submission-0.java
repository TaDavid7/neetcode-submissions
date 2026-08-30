class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] combo = new int[26];
        HashMap<String, List<String>> group = new HashMap<>();
        for(int i = 0; i<strs.length; i++){
            for(int k = 0; k<strs[i].length(); k++){
                int pos = strs[i].charAt(k) - 'a';
                combo[pos] += 1;
            }
            String key = Arrays.toString(combo);
            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }
            group.get(key).add(strs[i]);
            combo = new int[26];

        }
        return new ArrayList<>(group.values());
    }
}
