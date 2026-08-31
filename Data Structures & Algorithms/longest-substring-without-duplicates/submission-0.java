class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashSet<Character> check = new HashSet<>();
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            while(check.contains(s.charAt(right))){
                check.remove(s.charAt(left));
                left++;
            }
            check.add(s.charAt(right));
            result = Math.max(result, right-left + 1);
        }
        return result;
    }
}
