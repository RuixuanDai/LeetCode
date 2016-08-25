//only beat 14%


import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
import java.util.List;

public class Solution
{

	public static void main(String[] args)
	{
		String s = "2-1-1*8-6";
		List<Integer> a = diffWaysToCompute(s);
		for(int i :a)
		{
			System.out.println(i);
		}
		
	}
	public static List<Integer> diffWaysToCompute(String input) {
		int len = input.length();
		List<Integer> result;
		result = compute(input,0, len-1);
		Collections.sort(result);
		//Arrays.sort(result);
		
		return result;        
    }
	private static List<Integer> compute(String input,int l, int r)
	{
		List<Integer> result = new ArrayList<>();
		//int len = r-l+1;
		
		for(int i=l ; i<r ; i++)
		{
			if(input.charAt(i)=='+'||input.charAt(i)=='-'
					||input.charAt(i)=='*')
			{
				List<Integer> lresult = compute(input,  l, i-1);
				List<Integer> rresult = compute(input,  i+1, r);
				for(int j=0 ; j<lresult.size(); j++)
				{
					for(int k=0 ; k<rresult.size(); k++)
					{
						if(input.charAt(i)=='+')
						{
							int re = lresult.get(j)+rresult.get(k);
							result.add(re);
						}
						else if(input.charAt(i)=='-')
						{
							int re = lresult.get(j)-rresult.get(k);
							result.add(re);
						}
						else if(input.charAt(i)=='*')
						{
							int re = lresult.get(j)*rresult.get(k);
							result.add(re);
						}
					}
				}
			}
		}		
		if(result.isEmpty())
			result.add(Integer.valueOf(input.substring(l, r+1)));
		return result;
		
	}	
}
