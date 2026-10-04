public class trappingrainwater {
    class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lm[] = new int[height.length];
        lm[0] = height[0];
        for(int i=1; i<n ; i++){
            lm[i] = Math.max(height[i],lm[i -1]);
        }
        int rm[] = new int[height.length];
        rm[n-1] = height[n-1];
        for(int i=n-2; i>=0 ; i--){
            rm[i] = Math.max(height[i],rm[i +1]);
        }int tp = 0;
        for(int i =0; i<n;i++){
            int wl = Math.min(lm[i],rm[i]);
            tp = tp + (wl - height[i]);
        }
        return tp;
    }
}
}
