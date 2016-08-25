public class Solution {
	public int reverse(int x)
	{
		boolean negSign = x<0;
		x = negSign?-x:x;
		long result = 0;
		int res = x%10;
		while(x>=10||res!=0)
		{
			result *= 10;
			result+=res;
			x = x/10;
			res = x%10;
		}
		result = (negSign?-result:result);
		if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE) result = 0;
		
		return (int)result;
	}

}
