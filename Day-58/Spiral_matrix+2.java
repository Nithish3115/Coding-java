class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int idx=1;
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length -1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=idx++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=idx++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=idx++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                {
                    arr[i][left]=idx++;
                }
                left++;
            }
        }
        return arr;
    }
}