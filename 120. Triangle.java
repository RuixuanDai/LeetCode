public class Solution {
    public int minimumTotal(List<List<Integer>> triangle)
	{
		int row = triangle.size()-1;
		if(row<0) return 0;
		if(row==0) return triangle.get(0).get(0);
				
		int[] dp = new int[row+2];
		for(int i=row ; i>=0 ; i--)
		{
			for(int j=0 ; j<triangle.get(i).size() ; j++)
				dp[j] = triangle.get(i).get(j) + (dp[j]>dp[j+1]?dp[j+1]:dp[j]);
		}
		return dp[0];
	}
}
