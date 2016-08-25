/*
** 11,06,2016 first AC submission
** using the StringBuffer Class to avoid overflow. The "string" will cause overflow 
*/
public class Solution {
    public String reverseString(String s) {
	        
	        int n  = s.length();
	        StringBuffer str = new StringBuffer(n);
			for(int i = 0; i<n ; i++)
			{
				str.append(s.charAt(n-i-1));
			}
			return str.toString();
	        
	    }
}
