class Solution {
    public int uniquePaths(int m, int n) {
        return co(m,n,new HashMap<>());
    }
    static int co(int r,int c,HashMap <List <Integer>,Integer> a){
        if(c==1 || r==1){
            return 1;
        }
        List <Integer> pos =List.of(r,c);
        if(a.containsKey(pos)){
            return a.get(pos);
        }
        int l=co(r-1,c,a);
        int ri=co(r,c-1,a);
       a.put(pos,l+ri);
        
        return l+ri;
    }
}