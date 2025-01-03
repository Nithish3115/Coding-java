class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length -1;
        int[] re=new int [nums.length];
        int i=nums.length -1;
        while(l<=r){
            int ls = nums[l] * nums[l];
            int rs = nums[r] * nums[r];

            if (ls > rs){
                re[i]=ls;
                l++;
            }else{
                re[i]=rs;
                r--;
            }
            i--;
        }
        return re;
    }
}