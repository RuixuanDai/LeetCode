import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Solution {
  public List<String> findRepeatedDnaSequences(String s)
	{
		List<String> result = new ArrayList<>();
		Map<Character, Character> charmap = new HashMap<>(10);
		charmap.put('A', '0');
		charmap.put('C', '1');
		charmap.put('G', '2');
		charmap.put('T', '3');
		char[] sCopy = new char[s.length()];
		for(int i=0; i<s.length() ; i++)
			sCopy[i] = charmap.get(s.charAt(i));
		String ss = new String(sCopy);
		Map<Long, Character> DNAmap = new HashMap<>();
		for(int j=0 ; j<=s.length()-10; j++)
		{
			long temp = Long.parseLong(ss.substring(j, j+10));
			if(DNAmap.containsKey(temp))
			{
				if(DNAmap.get(temp)=='Y')
					result.add(s.substring(j, j+10));
				DNAmap.put(temp,'N');
			}
			else
				DNAmap.put(temp,'Y');					
		}
		return result;
		
		
		
	}
}
