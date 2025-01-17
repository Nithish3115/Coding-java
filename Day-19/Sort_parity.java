class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]%2 != 0){
                int te=nums[l];
                if(nums[r]%2 == 0){
                    nums[l]=nums[r];
                    nums[r]=te;
                    l++;
                    r--;
                }
                else{r--;}
            }else{l++;}
        }
        return nums;
    }
}