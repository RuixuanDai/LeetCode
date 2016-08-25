import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public static String largestNumber(int[] nums)
	{
		String[] strnum = new String[nums.length];
		int j = 0;
		for(int i:nums)
			strnum[j++] = Integer.toString(i);
		Arrays.sort(strnum, new Comparator<String>()
		{
			@Override
			public int compare(String o1, String o2)
			{
				// TODO Auto-generated method stub
				BigInteger n1 = new BigInteger(o1+o2);
				BigInteger n2 = new BigInteger(o2+o1);
				if (n1.equals(n2)) return 0;
				return -(n1.compareTo(n2)); //form big to small
			}
		});
		String res = new String();
		for(String str : strnum)
		{
			res += str;
		}
		if(new BigInteger(res).equals(new BigInteger("0"))) return "0";
		return res;		
	}
	
}
