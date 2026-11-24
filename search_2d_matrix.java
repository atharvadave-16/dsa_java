class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = matrix.length;
        int b = matrix[0].length;
        int l = 0, r = b*a -1;
        while(l <= r){
            int mid = l + (r - l) / 2;

            if(matrix[mid / b][mid % b] == target)  return true;
            else if(matrix[mid / b][mid % b] < target) {
                l = mid + 1;
            }else r = mid - 1;
        }
        return false;
    }
}