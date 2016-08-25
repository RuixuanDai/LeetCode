public class Solution {
  public boolean isAnagram(String s, String t)
	{
		int[] bitmap = new int[26];
		for(int i=0; i<s.length() ; i++)
		{
			bitmap[s.charAt(i)-'a'] ++;
		}
		for(int j=0 ; j<t.length() ; j++)
			bitmap[t.charAt(j)-'a']--;
		for(int i : bitmap)
			if(i!=0) return false;
		return true;
	}
}
