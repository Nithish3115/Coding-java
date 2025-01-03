class Solution {
    public void reverseString(char[] s) {
        int i=s.length-1;
        int k=0;
        while (k<i){
            char temp = s[k];
            s[k] = s[i];
            s[i] = temp;
            k++;
            i--;
        }
         
    }
}