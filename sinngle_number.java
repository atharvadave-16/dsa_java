import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> a = new HashSet<>();
        int sum = 0;
        for(int i: nums){
            a.add(i);
            sum = sum + i;
        }
        for (Integer i : a){
            sum = sum - (2*i);
        }
        return -1*sum ;
    }



//bit manipulation method


    public int singleNumber1(int[] nums) {
        
        int sum = 0;
        for(int i: nums){
            sum^= i;
        }
        return sum ;
    }
}