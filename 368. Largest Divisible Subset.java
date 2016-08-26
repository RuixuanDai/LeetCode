public class Solution {
public List<Integer> largestDivisibleSubset(int[] nums)
	{
		int len = nums.length;
		if(len<=0) return new ArrayList<>();;
		
		Arrays.sort(nums);
		int[] dp = new int[len];
		int[] path = new int[len];
		dp[0] = 1;
		int index = 0,amax = dp[0];
		
		for(int i=1 ; i<len ; i++)
		{
			path[i] = i;
			int max = 1;
			for(int j=0 ; nums[j]<=nums[i]/2 ; j++)
			{
				if(nums[i]%nums[j]!=0) continue;
				if(max<dp[j]+1){
					max = dp[j]+1; path[i] = j;
				}
			}
			dp[i] = max;
			if(amax<max){
				amax = max; index = i;
			}
		}
		
		Integer[] res = new Integer[amax];
		while(amax-->0)
		{
			res[amax] = nums[index];
			index = path[index];			
		}
		return Arrays.asList(res);
	}
}
