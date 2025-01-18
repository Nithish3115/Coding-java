class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int k:nums){
            if(i == 0 || i == 1 || nums[i-2]!=k ){
                nums[i]=k;
                i++;
            }
        }
        return i;
    }
}