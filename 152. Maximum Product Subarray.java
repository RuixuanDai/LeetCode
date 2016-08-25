public class Solution {
   public int maxProduct(int[] nums) {
		int len = nums.length;
		if(len==0) return 0;
		if(len==1) return nums[0];

		int max = nums[0] ;
		int neg = nums[0] , pos = nums[0];
		
		for(int i=1 ; i<nums.length ; i++)
		{
			int pos2 = pos;
			pos = Math.max(nums[i],Math.max(neg*nums[i], pos*nums[i]));
			neg = Math.min(nums[i],Math.min(neg*nums[i], pos2*nums[i]));
			max = pos>max?pos:max;
		}
		return max;
	}
}
