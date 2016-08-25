public class Solution {
   public int lengthOfLastWord(String s)
	{
		int size = s.length()-1;
		int result = 0;
        while(size>=0&&s.charAt(size)==' ') size--;
		while(size>=0&&s.charAt(size--)!=' ')
			result++;
		return result;
	}
}
