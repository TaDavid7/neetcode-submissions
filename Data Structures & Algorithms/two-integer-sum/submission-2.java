class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pair = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int comp = target-nums[i];
            if(pair.containsKey(comp)){
                return new int[]{pair.get(comp), i};
            }
            pair.put(nums[i], i);
        }
        return new int[2];
    }
}