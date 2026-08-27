class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        String lower = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //System.out.println(lower);
        int right = lower.length()-1;


        while(left <right){
            if(lower.charAt(left)!= lower.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
