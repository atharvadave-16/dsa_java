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

// optimal solution for space
class Solution2 {
    public boolean isAnagram(String s, String t) {
        int []a = new int[26];
        int n1 = s.length();
        int n2= t.length();
        if (n1 != n2){return false;}
        for(int i = 0; i<n1;i++){
            a[s.charAt(i) - 'a']++;
            a[t.charAt(i) - 'a']--;
        }
        for(int i = 0;i<26;i++){
            if(a[i] != 0){
                return false;
            }
        }
         return true;
            
        
    }
}