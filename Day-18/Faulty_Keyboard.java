class Solution {
    public String finalString(String s) {
        StringBuilder t= new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='i'){
                t.reverse();
            }else{
                t.append(ch);
            }
        }
       return  t.toString();
    }
}