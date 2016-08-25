public class Solution {
   public static int strStr(String haystack, String needle)
	{
		int result = -1;
		int lenHay = haystack.length();
		int lenNeedle = needle.length();
		if(lenNeedle>lenHay) return result;
		if(lenNeedle == 0) return 0;
		for(int i=0 ; i<=lenHay-lenNeedle ; i++)
		{
			int j=0,t=i;
			while(j<lenNeedle)
			{
				if(haystack.charAt(t++)!=needle.charAt(j++))
					break;
				if(j==lenNeedle) return i;
			}
		}
		
		return result;
	}
}
