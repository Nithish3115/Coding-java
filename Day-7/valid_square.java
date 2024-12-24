class Solution {
    public boolean isPerfectSquare(int num) {
         long l=1;
        long r=num;
        while(l<=r)
        {
            long m=(l+r)/2;
            long s=m*m;
            if(s==num){
                return true;
            }else if(s<num){
                l=m+1;
            }else{
                r=m-1;
            }
        }
                    return false;

    }
}