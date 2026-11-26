import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        int a = 0;
        int b = 0;
        //convert string to array
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        
        // 2. Sort the array
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        
        // 3. Convert back to String
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);
        
        return sorted1.equals(sorted2);
            
        
    }
}