

//using mergesort O(nlogn)


class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
		if (nums.length <=0) return 0;
    	long [] sums = new long[nums.length];
		sums[0] = nums[0];
		for(int i = 1; i<nums.length ; i++)
		{
			sums[i] = sums[i-1] + nums[i]; 
		}
    	int  result = 0;
    	long[] temp = new long[nums.length];
    	result = mergecount(sums,temp,0,nums.length-1,lower,upper);
    	
    	return result;
        
    }

	private int mergecount(long[] sums, long[] temp, int l, int r, int lower, int upper)
	{
		// TODO Auto-generated method stub
		//static int count = 0;
		if(r-l<=0)	
		{
			if(sums[l]>=lower&&sums[l]<=upper)
				return 1;
			else
				return 0;
		}
		int mid = (l+r)/2;
		int result;
		result = mergecount(sums,	temp , l	, mid	, lower, upper) 
				+ mergecount(sums, 	temp , mid+1, r	, lower, upper);
		int lp = l;
		int rp = l;
		int ll = l;
		int lt = l;
		
		for(int i = mid+1; i<=r;i++)
		{
			long max = sums[i] - lower;
			long min = sums[i] - upper;
			while(sums[lp]<min&&lp<=mid) lp++;
			rp = lp; // rp>=lp sorted
			while(sums[rp]<=max&&rp<=mid) rp++;
			result += rp - lp;
			while(sums[ll]<sums[i]&&ll<=mid)
				temp[lt++] = sums[ll++];
			temp[lt++] = sums[i];
			
		}
		while(ll<=mid)
			temp[lt++] = sums[ll++];
		//lp = l;
		for(lp = l; lp <= r; lp++)
			sums[lp] = temp[lp];
		
		
		
		
		return result;
	}
}
