class Solution {
    public int longestOnes(int[] nums, int k) {
        int max_w=0;
        int l=0;
        int n_z=0;
        int n = nums.length;

        for(int r=0;r<n;r++){
            if(nums[r]==0){
                  n_z++;
                  
            }

            while(n_z >k){
                if(nums[l]==0){
                    n_z--;
                    
                }
              l++;  
            }

           int  w= r - l+1;
            max_w=Math.max(max_w,w);
        }
return max_w;
    }
}
