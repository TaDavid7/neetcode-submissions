class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int left = 0;
        int right = height.length-1;
        int lMax = height[left], rMax = height[right];
        int result = 0;
        while(left < right){
            if(lMax < rMax){
                left++;
                lMax = Math.max(lMax, height[left]);
                result += lMax - height[left];
            } else{
                right--;
                rMax = Math.max(rMax, height[right]);
                result += rMax - height[right];
            }
        }
        return result;
    }
}
