class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result={-1,-1};
        int l=bs(nums, target, true);
        int r=bs(nums, target, false);
        result[0]=l;
        result[1]=r;
        return result;
    }

    private int bs(int[] nums, int target, boolean leftb){
        int left =0;
        int right = nums.length -1;
        int i=-1;
        while (left<=right){
            int m=(left+right)/2;
            if(target>nums[m]){
                left=m+1;
            }else if(target <nums[m]){
                right=m-1;
            }else{
                i=m;
                if (leftb){
                    right=m-1;
                }else{
                    left=m+1;
                }
            }
        } 

        return i;
    }
}