class Solution {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
            if (digits.isEmpty()) return new ArrayList<>();

        return le("",digits);
        
    }
    static List<String> le(String p,String up){
             if(up.length()==0){
                List<String> list=new ArrayList<>();
                list.add(p);
                return list;
             }
             int c=up.charAt(0) - '0';

             String gs=key[c];
             
            List<String> list=new ArrayList<>();

             for(int i= 0 ;i <gs.length();i++){

                
                list.addAll(le(p+gs.charAt(i),up.substring(1)));
             }
             return list;
    }
}