class Solution {
    public int firstUniqChar(String s) {
        int[] fre=new int [26];
        for(char a : s.toCharArray()){
            fre[a - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(fre[s.charAt(i) - 'a'] == 1){
                return i;
            }

            
        }

        return -1;
    }
}