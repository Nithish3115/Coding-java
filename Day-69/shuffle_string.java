class Solution {
    public String restoreString(String s, int[] indices) {
        int n =	indices.length;    	
    	char[] c =  new char[s.length()];    	
    	for (int i = 0; i < indices.length; i++) {			
    		c[indices[i]] =  s.charAt(i); 		
		}
    	
    	return new String(c);

    }
}