class Solution {
    public int rob(int[] nums) {
      return  sum(nums,0,new HashMap<>());
    }
    public static int sum(int[] num,int i,HashMap<Integer,Integer> a){
        if(i>= num.length){
            return 0;
        }
       if(a.containsKey(i)){
        return a.get(i);
       }
       int res=Math.max(sum(num,i+1,a),num[i]+sum(num,i+2,a));
     a.put(i,res);
     return res;
    }
}