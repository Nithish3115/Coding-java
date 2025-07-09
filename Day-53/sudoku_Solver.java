class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if (board[i][j]=='.'){
                    for(char c='1';c <='9';c++){
                         if(isvalid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board)) {return true;}
                            board[i][j]='.';
                         }
                    }
                     return false;
                }
               
            }
        }
        return true;
    }


    public static boolean isvalid(char[][] board,int r,int c,int n){
        for(int i=0;i<9;i++){
            if(board[i][c]==n || board[r][i]==n){
                return false;
            }
        }
        int sr=(r /3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sc+3;i++){
            for(int j=sr;i<sc+3;i++){
                if(board[i][j]==n){
                    return false;
                }
            }
        }
        return true;
    }
}