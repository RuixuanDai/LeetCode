public class Solution {
    	public static String reverseVowels(String s)
	{
		char[] res = new char[s.length()];
		//char[] v = {'a','e','i','o','u','A','E','I','O','U'};
		List<Character> vv = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
		Set<Character> vowel = new HashSet<>(vv);
		
		int start = 0; int end = s.length()-1;
		while(start<=end)
		{
			while(start<=end&&
					!vowel.contains(s.charAt(start)))
			{
				//if(start>end) break;
				res[start] = s.charAt(start);
				start++;
			}
			while(start<=end&&
					!vowel.contains(s.charAt(end)))
			{
				//if(start>end) break;
				res[end] = s.charAt(end);
				end--;
			}
			if(start>end) break;
			res[start] = s.charAt(end);
			res[end--] = s.charAt(start++);								
		}
		
		return String.valueOf(res);
	}
}
