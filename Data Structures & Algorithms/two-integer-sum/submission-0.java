class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(elements.get(difference) != null){
                result.add(elements.get(difference));
                result.add(i);
            }
            else{
                elements.put(nums[i], i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
