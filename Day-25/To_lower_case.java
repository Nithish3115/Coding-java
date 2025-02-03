class Solution {
    public String toLowerCase(String s) {
        StringBuilder b = new StringBuilder();
        for(char a:s.toCharArray()){
            b.append(Character.toLowerCase(a));
        }

        return b.toString();
    }
}