public class Solution {
    	public String longestCommonPrefix(String[] strs) 
	{
        if(strs==null) return null;
        
        
        int num = strs.length;
        if(num == 0) return "";
        int len = strs[0].length();
        int common = 0;
        boolean flag = true;
        
        
        if(len==0) return "";
        
        char c = strs[0].charAt(0);
        for(int i=0; i<len&&flag ; i++)
        {
        	for(int j=1 ; j<num ; j++)
        	{
        		if(strs[j].length()<=i||strs[j].charAt(i)!=c)
        		{
        			common--;
        			flag = false;
        			break;
        		}
        	}
        	common++;
        	if(common<strs[0].length()) // judge the length of strs[0]
        		c = strs[0].charAt(common);
        	else flag = false;
        }
        if(common == -1) return "";
        else
        	return strs[0].substring(0, common);
        
    }
}
