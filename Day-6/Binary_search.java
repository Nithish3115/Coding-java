class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length - 1;
        
        while(left<=right){
            int m=(left+right)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                left=m+1;
            }else if(nums[m]>target){
                right=m-1;
            }
        }
        return -1;
    }
}