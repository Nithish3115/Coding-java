class Solution {
    public String firstPalindrome(String[] words) {
        for(String w: words ){
            if(isPalindrome(w)){
                return w;
            }
        }
        return "";
    }




    private boolean isPalindrome(String word) {
           word=word.toLowerCase();
              int i=0;
              int j=word.length()-1;
              while(i<j){
                if(word.charAt(i)!=word.charAt(j)){
                    return false;
                }
                i++;
                j--;
              }
              return true;
    }
}