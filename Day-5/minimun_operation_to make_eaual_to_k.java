class Solution {
    public int minOperations(int[] nums, int k) {
        int operations=0;
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums)
            uniqueNums.add(num);
        for(int n:uniqueNums){
            if(n == k){
                continue;
            }if(n < k){
                return -1;
            }
            else{
                operations++;
            }
        }
        return operations;
    }
}