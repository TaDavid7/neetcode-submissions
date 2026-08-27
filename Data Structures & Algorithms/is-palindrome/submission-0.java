class Solution {
    public boolean isPalindrome(String s) {
        String spaces = s.toLowerCase().trim();
        String spaces2 = spaces.replaceAll("[^a-zA-Z0-9 ]", "");
        String palindrome = spaces2.replaceAll("\\s+", ""); 
        for(int i = 0; i<palindrome.length()/2; i++){
            int k = (palindrome.length()-1) - i;
            if(palindrome.charAt(i) != palindrome.charAt(k)){
                //System.out.println(palindrome);
                //System.out.println(palindrome.charAt(k));
                return false;
            }    
        }
        return true;
    }
}
