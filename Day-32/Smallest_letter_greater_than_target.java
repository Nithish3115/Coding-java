class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        char s=' ';
        for(int i=0;i<n;i++){
            if(letters[i]==target){
                continue;
            }
            else if(letters[i]>target && (s==' '|| letters[i]<s)){
                s=letters[i];
            }
        }
     return s ==' ' ? letters[0]:s;
        
    }
}