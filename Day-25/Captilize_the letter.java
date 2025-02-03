class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder ap = new StringBuilder();
        String[] words = title.split(" "); 
        for (String word : words) {
            if (word.length() <= 2) {              
                ap.append(word.toLowerCase());
            } else {
                 
                ap.append(Character.toUpperCase(word.charAt(0))); 
                ap.append(word.substring(1).toLowerCase());  
            }
            ap.append(" ");  
        }
      return ap.toString().trim();
    }
}