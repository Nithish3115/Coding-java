class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         k=k%n;
         rev(nums,0,n-1);
         rev(nums,0,k-1);
         rev(nums,k,n-1);

    }
    static void rev(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
    }
}