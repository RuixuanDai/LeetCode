public class Solution {
 	public static int threeSumClosest(int[] nums, int target) 
	{
		int len = nums.length;
		int tempsum;
		if(len==3) return nums[0] + nums[1] + nums[len-1];
		
		Arrays.sort(nums);
		int sum = nums[0] + nums[1] + nums[len-1];
		
//		int a = nums[0];
		int l,r;
		//r = len-1;
		
		for (int i=1 ; i<len-2 ; i++)
		{
			l = i; r = len-1;
			tempsum = nums[i - 1] + nums[l] + nums[r];
			while (l < r-1)
			{
				if (tempsum < target)
				{
					int tempsum2 = nums[i - 1] + nums[1+l] + nums[r];
					if ((target - tempsum) < (Math.abs(target - tempsum2)))
						break;
					else
					{
						l++;
						tempsum = tempsum2;
						if((Math.abs(target - sum))>(Math.abs(target - tempsum2)))
							sum = tempsum2;
					}
				} else if (tempsum > target)
				{
					int tempsum2 = nums[i - 1] + nums[l] + nums[r-1];
					if ((tempsum - target) < (Math.abs(tempsum2 - target)))
						break;
					else
					{
						r--;
						tempsum = tempsum2;
						if((Math.abs(target - sum))>(Math.abs(target - tempsum2)))
							sum = tempsum2;
					}
				}else
					return target;
			}			
		}
		tempsum = nums[len - 1] + nums[len-2] + nums[len-3];
		if((Math.abs(target - sum))>(Math.abs(target - tempsum)))
		sum = tempsum;
       return sum;		
        		
    }
}
