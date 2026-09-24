class Solution {
    private int[] mem;
    public int rob(int[] nums) {
        //gain and go 2 houses over
        //or do nothing and 1 house over
        mem = new int[nums.length];
        Arrays.fill(mem, -1);
        return dfs(nums, 0);
    }

    private int dfs(int[] nums, int i){
        if(i >= nums.length){
            return 0;
        }
        if(mem[i] != -1){
            return mem[i];
        }
        mem[i] = Math.max(dfs(nums, i + 1),
                    nums[i] + dfs(nums, i+2));
        return mem[i];
    }
}
