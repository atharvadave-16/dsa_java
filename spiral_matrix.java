import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int sr = 0;
        int sc = 0;
        int er = matrix.length -1;
        int ec = matrix[0].length - 1;
        List<Integer> a = new ArrayList<>();

        while(sr < er+1 && sc < ec +1){
            for(int i = sr;i <= ec;i++){
                a.add(matrix[sr][i]);
            }
            for(int i = sr +1;i <=er;i++){
                a.add(matrix[i][ec]);
            }
            if(sr != er){
            for(int i = ec -1;i >= sc;i--){
                a.add(matrix[er][i]);
            }}
           
            if(sc != ec)  {
            for(int i = er -1;i > sr;i--){
                a.add(matrix[i][sc]);
            }}
            sr++;
            sc++;
            er--;
            ec--;
        }
        return a;
    }
}
}
