public class Solution {
   	public static String fractionToDecimal(int numerator, int denominator)
	{
		long n = numerator;
		long d = denominator;
		boolean neg = n*d<0;
		n = Math.abs(n);
		d = Math.abs(d);
		
		String result = neg?"-"+Long.toString(n/d):Long.toString(n/d);
		long remainder = n%d;				
		return (remainder==0)?result:(result+"."+fTd(remainder,d));
		
	}

	private static StringBuilder fTd(long remainder, long d)
	{
		Map<Long, Integer> m = new HashMap<>();
		StringBuilder s = new StringBuilder();
		int i = 0;

		while (remainder != 0 && !m.containsKey(remainder))
		{
			m.put(remainder, i++);
			remainder *= 10;
			s.append(Long.toString(remainder / d));
			remainder %= d;
		}
		if (remainder != 0)
		{
			s.insert(m.get(remainder), "(");
			s.append(")");
		}
		return s;
	}
}
