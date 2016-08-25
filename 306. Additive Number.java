/*
** using recursion, not a good soltion, only beat 1%
*/

import java.math.BigInteger;


public class Solution {

	public static void main(String[] args)
	{
		Solution s = new Solution();
		String str = "199100199";
		System.out.println(s.isAdditiveNumber(str));
	}
	
    public boolean isAdditiveNumber(String num) {
		int len = num.length();
		boolean flag = false;
		boolean zero = false;
		boolean zero1 = false;
		boolean zero2 = false;
		BigInteger a,b,c;
		for(int i = 0; i <=len/2&&!zero; i++)
		{
			if(num.charAt(0)=='0') zero =true;
			 a = new BigInteger(num.substring(0, i+1));
			 zero1 = false;
			for(int j = i+1;j<len-1&&!zero1;j++)
			{ 	
				if(num.charAt(i+1)=='0') zero1 =true;
				b = new BigInteger(num.substring(i+1, j+1));
				zero2 = false;
				for(int k = j+1;k<len&&!zero2;k++)
				{
					if(num.charAt(j+1)=='0') zero2 =true;
					c = new BigInteger(num.substring(j+1,k+1));
					if(c.equals(a.add(b)))
					{

						System.out.println(a.toString() + "a");
						System.out.println(b.toString() + "b");
						System.out.println(c.toString() + "c");
						flag = isAdd(len, k, num, b, c);
					}
				}
			}
			
		}
    	
    	
    	
    	return flag;
        
    }

	private boolean isAdd(int len, int l, String num,BigInteger a,BigInteger b)
	{
		// TODO Auto-generated method stub
		if(l==len-1) return true;
		BigInteger c;
		boolean zero = false;
		for(int j = l+1;j<len&&!zero;j++)
		{
			if(num.charAt(l+1)=='0') zero =true;
			c = new BigInteger(num.substring(l+1,j+1));
			if(c.equals(a.add(b)))
			{
				System.out.println(a.toString()+"a");
				System.out.println(b.toString()+"b");
				System.out.println(c.toString()+"c");
				return isAdd(len,j,num,b,c);
			}
					
		}
		return false;
	}
}
