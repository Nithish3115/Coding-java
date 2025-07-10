class Solution {
    public int tribonacci(int n) {
        return dp(new HashMap<>(),n);
       
    }
    public static int dp( HashMap<Integer,Integer> a,int n){
        if(n==0||n==1){
            return n;
        }
        if(n==2){
            return 1;
        }
        
        if(a.containsKey(n)){
            return a.get(n);
        }
        int res=dp(a,n-1)+dp(a,n-2)+dp(a,n-3);
            a.put(n,res);
        
        
        return (res);
    }
}