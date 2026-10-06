public class matrix_diagonal_sum{
    class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int a = mat.length;
        int b = a-1;
        for(int i = 0;i <a;i++){
            sum = sum + mat[i][i];
            if(i != b){
            sum = sum+mat[i][b];}
            b--;

        }
        return sum ;
    }
    
}
}