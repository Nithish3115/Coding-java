class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][] board =new char [n][n];
        List<List<String>> a=new ArrayList<>();
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
         queens(board,0,a);
         return a;
    }

       
    public  void queens(char[][] board,int n, List<List<String>> a){
        
    if(n==board.length){
    
    a.add(construct(board));
    
    return;
}       

    for(int i=0;i<board.length;i++){
        if(issafe(board,n,i)){
            board[n][i]='Q';
            queens(board,n+1,a);
            board[n][i]='.';
        }
         
    }

    }

public boolean issafe(char[][] board,int n,int i){
    for(int j=0;j<n;j++){
           if(board[j][i]=='Q'){
            return false;
           }
    }
    int maxleft=Math.min(n,i);
    for(int f=1;f<=maxleft;f++){
        if(board[n-f][i-f]=='Q'){
            return false;
        }

    }
    int maxright=Math.min(n,board.length-i-1);
    for(int f=1;f<=maxright;f++){
        if(board[n-f][i+f]=='Q'){
            return false;
        }

    }
    return true;

}      

public List<String> construct(char[][] board){
    List<String> m=new ArrayList<>();
    for(int i=0;i<board.length;i++){
       String k=new String (board[i]);
       m.add(k);
    }
    return m;

    
}

}