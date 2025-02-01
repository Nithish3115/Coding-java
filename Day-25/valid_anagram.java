class Solution {
    public boolean isAnagram(String s, String t) {
        int[] fr=new int[26];
        
        
        if(s.length() != t.length()){return false;}
        for(char a: s.toCharArray()){
            fr[a - 'a']++;
        }
        for(char b: t.toCharArray()){
            fr[b - 'a']--;
        }
        for(int c :fr){
            if(c!=0){
                
                 
                return false;
            }
        }
        return true;
        
        

   
    }

}