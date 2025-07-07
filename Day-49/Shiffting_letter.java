class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        
     return h(s.toCharArray(), shifts, s.length() - 1, 0);
    }

    static String h(char[] s, int[] shifts, int i, int ts){
        if(i<0){
            return new String(s);
        }
        ts=(ts+shifts[i])%26;
        s[i]= (char)(((s[i]-'a')+ts)%26  +'a');
        return h(s,shifts,i-1,ts);

    }

}