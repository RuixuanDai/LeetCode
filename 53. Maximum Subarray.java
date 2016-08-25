public class Solution {
    public int maxSubArray(int[] nums)
	{	
		int result = 0;
		if(nums.length<=0) return result;
		int tempsum = nums[0];
		result = nums[0];
		for(int i=1 ; i<nums.length ; i++)
		{
			if(tempsum<0) tempsum = 0;
			tempsum += nums[i];
			if(tempsum>result) result = tempsum;
		}
		return result;

	}
}
