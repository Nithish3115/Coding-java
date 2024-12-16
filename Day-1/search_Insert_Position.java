// 35. Search Insert Position
 
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Solution:

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right= nums.length -1;
        while(left<=right){
            int m=(left+right)/2;
            if(nums[m]==target){
                return m;
            }else if(nums[m]<target){
                left=m+1;
            }else{
                right=m-1;
            }
        }
        return left;
    }
}