public class buyandsellstock {
    class Solution {
    public int maxProfit(int[] prices) {
        int maxp = 0;
        int bp = Integer.MAX_VALUE;
        
        for(int i = 0;i<prices.length;i++){
           
                if(bp < prices[i]){
                    int p = prices[i]-bp;
                    maxp = Math.max(maxp,p);
                }else{
                    bp = prices[i];
                }
        }
        return maxp;
    }
}
    
}
