class Solution {
    public int totalNQueens(int n) {
        char[][] a=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              a[i][j] = '.';
            }
        }
       return  queens(a,0);
        
    }
    public static int queens(char[][] a,int n){
        if(n==a.length){
            return 1;
        }
        int count =0;

        for(int i=0;i<a.length;i++){
             
                if(issafe(a,n,i)){
                    a[n][i]='Q';
                    count=count+queens(a,n+1);
                    a[n][i]='.';
                }
            
        }
        return count;

}

static boolean issafe(char [][] a,int r,int c){
    for(int i=0;i<r;i++){
        if(a[i][c]=='Q'){
            return false;
        }
    }
    int minl=Math.min(r,c);
    int minr =Math.min(r,a.length -1-c);

    for(int i=r-1, j=c-1;i>=0&&j>=0;i--,j--){
        if(a[i][j]=='Q'){
            return false;
        }
    }
    for(int i=r-1,j=c+1;i>=0&&j<a.length;i--,j++){
        if(a[i][j]=='Q'){
            return false;
        }
    }
    return true;
}
}