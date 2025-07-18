class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] k = new int[n];

        for(int i=0;i<n;i++){
       k[i]=1;
        }

        for(int i=1;i<n;i++){
            k[i]= k[i-1]*nums[i-1];
        }
        int r= nums[n-1];
        for(int i=n-2;i>=0;i--){
            k[i] *=r;
            r *= nums[i];
        }


     return k;   
    }
}