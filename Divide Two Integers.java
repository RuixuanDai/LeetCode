public class Solution {

	public static int divide(int dividend, int divisor)
	{	
		int sign = 1;
		if(dividend<0) sign = -sign;
		if(divisor<0) sign = -sign;
		if(divisor == 0) return Integer.MAX_VALUE;
		//if(dividend >= 2147483647) return Integer.MAX_VALUE;
		long d1 = Math.abs((long)dividend);
		long d2 = Math.abs((long)divisor);
		long result = division(d1,d2);
		if(sign<0) 
		{	if(result<-2147483648L) return Integer.MAX_VALUE;
			else return (int) -result;
		}
		else 
			if(result>2147483647L)return Integer.MAX_VALUE;
		return (int) result;
		
		
	}

	private static long division(long d1, long d2)
	{
		// TODO Auto-generated method stub
		if(d1<d2) return 0;
		if(d1 == d2) return 1;
		long res = 1; long dd1 = d1; long dd2 = d2;
		while(dd1>dd2)
		{
			dd2 = dd2<<1;
			res = res<<1;
		}
		res>>=1;
		dd2>>=1;
		res += division(d1-dd2, d2);
		return res;
	}
}
