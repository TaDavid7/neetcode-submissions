class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        int max = 0;
        int longest = 0;
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int temp = nums[i];
                while(set.contains(temp)){
                    longest++;
                    temp++;
                }
                if(longest > max){
                    max = longest;
                }
                longest = 0;
            }
        }
        return max;
    }
}
