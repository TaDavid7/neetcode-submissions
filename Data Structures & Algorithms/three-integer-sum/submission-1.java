class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //nums[i] + nums[j] + nums[k] == 0
        // -nums[k] == nums[i] + nums[j]
        // -nums[k] is the target
        int[] num = nums;
        Arrays.sort(num);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<num.length; i++){
            if (i > 0 && num[i] == num[i-1]) continue;
            int target = (num[i]) * (-1);
            int start = i+1;
            int end = (num.length-1);
            while(start<end){
                if(num[start] + num[end] == target){
                    result.add(Arrays.asList(num[start], num[end], num[i]));
                    while (start < end && num[start] == num[start+1]) start++;
                    start++;
                    while (start < end && num[end] == num[end-1]) end--;
                    end--;
                    continue;
                }
                else if(num[start] + num[end] < target){
                    start++;
                }
                else{
                    end--;
                }
            }
        }
        return result;
    }
}
