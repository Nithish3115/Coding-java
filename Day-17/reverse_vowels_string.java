class Solution {
    public String reverseVowels(String s) {
        char [] w=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        String v="aeiouAEIOU";

        while(l<r){
            while(l<r && v.indexOf(w[l])==-1){
                l++;
            }
            while(l<r && v.indexOf(w[r])==-1){
                r--;
            }

            char t=w[l];
            w[l]=w[r];
            w[r]=t;

            l++;
            r--;
        }
        String a=new String(w);
        return a;
    }
}