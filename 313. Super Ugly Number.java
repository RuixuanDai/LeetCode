public class Solution {
    	public int nthSuperUglyNumber(int n, int[] primes)
	{
		if(n<=0||primes.length<=0) return 0;
		int[] times = new int[primes.length];
		int[] dp = new int[n];
		dp[0] = 1;
		for(int i=1; i<n ; )
		{
			int min = Integer.MAX_VALUE;
			int flag = -1;
			for(int j=0 ; j<primes.length ; j++)
			{
				int temp = dp[times[j]]*primes[j];
				if(temp<min)
				{
					min = temp; flag = j;
				}
			}
			if(dp[i-1] != min)
			dp[i++] = min;
			times[flag] ++;
			//System.out.print(min+" ");
		}
		return dp[n-1];
		
	}
}
