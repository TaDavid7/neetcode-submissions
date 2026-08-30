class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0; int r = matrix.length * matrix[0].length - 1;
        while(l<=r){
            int mid = l + ((r-l)/2);
            int mid1 = mid/matrix[0].length;
            int mid2 = mid % matrix[0].length;
            if(matrix[mid1][mid2] == target){
                return true;
            }
            else if(matrix[mid1][mid2] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }    
}
