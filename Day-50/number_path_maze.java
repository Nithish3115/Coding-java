class Solution {
    public int uniquePaths(int m, int n) {
        return co(m,n);
    }
    static int co(int r,int c){
        if(c==1 || r==1){
            return 1;
        }
        int l=co(r-1,c);
        int ri=co(r,c-1);
        return l+ri;
    }
}