class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int n=matrix.length;
        int c=matrix[0].length;
        int r=(n * c)-1;
        while(l<=r){
            int m=(l+r)/2;
            int i=m/c;
            int j=m%c;

            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]<target){
                l=m+1;
            }else{
                r=m-1;
            }


        }

        return false;


    }
}