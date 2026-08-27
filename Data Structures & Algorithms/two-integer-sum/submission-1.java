class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(elements.get(difference) != null){
                return new int[]{elements.get(difference), i};
            }
            else{
                elements.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
