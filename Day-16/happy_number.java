class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)){
        set.add(n);
        n=square(n);
        if(n==1){
            return true;
        }
        

    }
    return false;
    }

    private int square(int n){
                  int ans =0;
                 while(n!=0){
                    int re =n%10;
                    ans =ans+(re*re);
                    n=n/10;
                 }
                 return ans;
    }
}