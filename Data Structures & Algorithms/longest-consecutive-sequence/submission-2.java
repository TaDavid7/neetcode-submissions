class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i] - 1)){
                continue;
            }
            int count = 0;
            int temp = nums[i];
            while(set.contains(temp)){
                count++;
                temp++;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
