class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            String left = String.valueOf(s.charAt(l)).toLowerCase();
            String right = String.valueOf(s.charAt(r)).toLowerCase();
            if((s.charAt(l) < 'a' || s.charAt(l) > 'z') && (s.charAt(l) < 'A' || s.charAt(l) > 'Z') && (s.charAt(l) < '0' || s.charAt(l) > '9') ){
                l++;
                continue;
            }
            if((s.charAt(r) < 'a' || s.charAt(r) > 'z') && (s.charAt(r) < 'A' || s.charAt(r) > 'Z') && (s.charAt(r) < '0' || s.charAt(r) > '9')){
                r--;
                continue;
            }
            if(!left.equals(right)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
