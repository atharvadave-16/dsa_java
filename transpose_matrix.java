class Solution {
    public int[][] transpose(int[][] matrix) {
        int a = matrix.length ;
        int b = matrix[0].length ;
        int c[][] = new int[b][a];
        for(int i = 0;i<b;i++){
            for(int j = 0;j<a;j++){
                
               c[i][j] = matrix[j][i];
                
            }
        }
        return c;
    }
}