class Solution {
    public int countElements(int[] nums) {
        int n=nums.length;
        int l=0,h=0;
        int c=0;
        for(int i=0;i<n;i++){
            l=0;
            h=0;
            for(int j=0;j<n;j++){
                if(nums[i]<nums[j]){
                    l++;
                }
                else if(nums[i]>nums[j]){
                    h++;
                }
            }
            if(l>0 && h>0){
                c++;
            }
        }
        return c;
    }
}