class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int c=obstacleGrid[0].length;
        return grid(obstacleGrid,obstacleGrid.length-1,c-1,new HashMap<>());
    }
    public static int grid(int [][]a,int r,int c,HashMap <List <Integer>,Integer> g){
         

         if (r < 0 || c < 0 || a[r][c] == 1) {
            return 0;
        }
         
        if (r == 0 && c == 0) {
            return 1;
        }
        List <Integer> pos =List.of(r,c);

         if(g.containsKey(pos)){
            return g.get(pos);
        }
        int l=grid(a,r-1,c,g);
        int ri=grid(a,r,c-1,g);
        int res =l+ri;
        g.put(pos,res);
        return res;
    }
}