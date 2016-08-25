public class Solution {
 public int coinChange(int[] coins, int amount)
	{
		if(amount == 0) return 0;
		if(amount<0 || coins.length<=0) return -1;
		int[] dp = new int[amount+1];
		//dp initialize
		for(int i=1 ; i<dp.length ; i++)
			dp[i] = Integer.MAX_VALUE;
		for(int j=1 ; j<=amount ; j++)
		{
			for(int n=0 ; n<coins.length ; n++)
			{
				if(coins[n]<=j){
					int diff = j - coins[n];
					if(dp[diff]!=Integer.MAX_VALUE){
						dp[j] = (dp[diff]+1)<dp[j]?(dp[diff]+1):dp[j];
					}
				}
				
			}
		}
		return dp[amount]!=Integer.MAX_VALUE?dp[amount]:-1;
		
	}
}
