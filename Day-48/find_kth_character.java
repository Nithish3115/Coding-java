class Solution {
    public char kthCharacter(int k) {
        StringBuilder n=new StringBuilder("a");
       return res(n,k);
    }
    static char res(StringBuilder res,int k){
        if(res.length()>= k){
            return res.charAt(k-1);
        }
        int n=res.length();
        for(int i=0;i<n;i++){
            char c=res.charAt(i);
            res.append((char)(c+1));
        }
        return res(res,k);
    }
}