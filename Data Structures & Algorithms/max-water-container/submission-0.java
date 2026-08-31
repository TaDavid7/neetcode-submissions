class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        //1, 7, 2, 5, 4, 7, 3, 6
        int i = 0;
        int j = heights.length-1;
        while(i < j){
            int area = (j-i) * (Math.min(heights[i], heights[j]));
            max = Math.max(max, area);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
