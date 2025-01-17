class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        int r=s.length()-1;
        // StringBuilder a= new StringBuilder();
        char[] a=s.toCharArray();
         while(l<r){
            if( Character.isLetter(a[l])){
                char te=a[l];
                if( Character.isLetter(a[r])){
                          a[l]=a[r];
                          a[r]=te;
                          l++;
                          r--;
                }else{
                    r--;
                }
            }else{
                l++;
            }

         }
         
         return  new String(a);
    }
}