class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String, Integer> sChars = new HashMap<>();
        HashMap<String, Integer> tChars = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            String sPos = String.valueOf(s.charAt(i));
            String tPos = String.valueOf(t.charAt(i));
            sChars.put(sPos, sChars.getOrDefault(sPos, 0) + 1);
            tChars.put(tPos, tChars.getOrDefault(tPos, 0) + 1);
        }
        return sChars.equals(tChars);
    }
}
