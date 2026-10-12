import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> a = new ArrayList<>();
        
        for(int i = 0;i < n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int l  = i+1;
            int r = n-1;
            while(l<r){
              if(nums[i] + nums[l] + nums[r] == 0 ){
                List<Integer> b = new ArrayList<>();
              b.add(nums[i]);
              b.add(nums[l]);
              b.add(nums[r]);
              a.add(new ArrayList<>(b));
              
              while(l<r && nums[l]==nums[l+1]){
              l++;}
              while(l<r && nums[r] == nums[r-1]){
              r--;}
              l++;
              r--;
              }
              else if(nums[i] + nums[l] + nums[r] > 0){
                  r--;
              }
              else if(nums[i] + nums[l] + nums[r] < 0){
                  l++;
              }

            }
           
        }return a;
    }
}
}
