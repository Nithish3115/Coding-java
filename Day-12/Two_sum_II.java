class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length -1 ;
        int a[]=new int[2];
        while(i<j){
            if((numbers[i]+numbers[j])==target){
                     a[0]=i+1;
                     a[1]=j+1;
                     return a;
            }

            if((numbers[i]+numbers[j])>target){
                j--;
            }
            else if((numbers[i]+numbers[j])<target){
                i++;
            }
        }
        
        return new int[0];
    }
}