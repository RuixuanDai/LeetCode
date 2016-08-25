public class Solution {
 	public static int[] searchRange(int[] nums, int target)
	{
		int len = nums.length;
		int l = 0;
		int r = len-1;
		int mid = (l+r)/2;
		
		int l2, r1 , mid1 = -1, mid2 = -1;
		while(l<=r)
		{
			if(nums[mid]>target)
			{
				r = mid-1;
				mid = (l+r)/2;
			}
			else if(nums[mid]<target)
			{
				l = mid+1;
				mid = (l+r)/2;
			}
			else
			{
				mid1 = (l+mid)/2;
				mid2 = (r+mid)/2;
				r1 = mid;  l2 = mid;
				while(l<=r1)//mid1!=l&&mid1!=r1
				{
					if(nums[mid1]<target)
					{
						l = mid1+1;
						mid1 = (r1+l)/2;
					}else
					{
						r1 = mid1-1;
						mid1 = (r1+l)/2;						
					}					
				}
				mid1++;
				while(l2<=r)//mid2!=l2&&mid2!=r
				{
					if(nums[mid2]>target)
					{
						r = mid2-1;
						mid2 = (r+l2)/2;
					}else
					{
						l2 = mid2+1;
						mid2 = (r+l2)/2;
					}					
				}
				break;
			}			
		}
		if(nums[0]==target) mid1=0;
//		if(nums[len-1]==target) mid2=len-1;
		int[] res = {mid1,mid2};
		return res;
	}
}
