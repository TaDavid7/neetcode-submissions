class Solution {
    public String minWindow(String s, String t) {
        if(t.isEmpty()) return "";
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for(char c: t.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int smallest = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;
        int has = 0;
        int match = freq.size();
        int l = 0;
        for(int i = 0; i<s.length(); i++){
            char pos = s.charAt(i);
            window.put(pos, window.getOrDefault(pos, 0) + 1);
            if(freq.containsKey(pos) && window.get(pos).equals(freq.get(pos))){
                has++;
            }
            while(has == match){
                if( (i-l + 1) < smallest){
                    smallest = i-l + 1;
                    start = l;
                    end = i;
                }
                char lpos = s.charAt(l);
                window.put(lpos, window.get(lpos) - 1);
                if(freq.containsKey(lpos) && window.get(lpos) < freq.get(lpos)){
                    has--;
                }
                l++;
            }
        }
        return smallest == Integer.MAX_VALUE ? "" : s.substring(start, end+1);

    }
}
