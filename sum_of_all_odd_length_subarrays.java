public class sum_of_all_odd_length_subarrays {
    class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum  = 0;
        for(int i = 0; i < arr.length; i++){
         for(int j = i; j < arr.length; j++){
             if((j-i+1) % 2 != 0){
              for(int a= i;a<=j;a++){
                   sum += arr[a];
              }
        }
    }
}  return sum;
    }
}
}
