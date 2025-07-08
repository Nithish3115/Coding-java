class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int i=0;
        int res=0;
        while(i<n-1){
            while(i<n-1 && prices[i]>=prices[i+1]){
                i++;
            }
            int lm=prices[i];
            while(i<n-1 && prices[i]<=prices[i+1]){
                i++;
            }
            int gm=prices[i];
            res +=(gm-lm);
        }
return res;

    }
}