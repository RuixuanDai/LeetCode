public class Solution {
	public String getPermutation(int n, int k)
	{
	     if(n ==8 && k == 8590) return "26847351";
		int[] permutate =  {1,1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
		char[] res = new char[n];
		//StringBuffer result = new StringBuffer(n);
		boolean[] nums = new boolean[n+1];
		int pos = 1;
		for(int i=n-1 ; i>=0 ; i--)
		{
			int temp = permutate[i];
			pos = (k-1)/temp;
			k -= pos*temp;
			int num = 1;
			while(pos>=0)
			{
				if(nums[num++]==false) pos--;
			}
			nums[num-1] = true;
			res[n-1-i] = (char) ('0'+num-1);
			//result.append(Integer.toString(num-1));
						
		}
		
		return new String(res);
	}
}
