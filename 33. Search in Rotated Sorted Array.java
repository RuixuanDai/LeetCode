public class Solution {
	public static int search(int[] nums, int target)
	{
		int len = nums.length;
		int i=0;//the pivot
		for(i=0 ; i<nums.length ; i++)
		{
			if(i+1<nums.length&&nums[i]>nums[i+1])
			{break;}
		}
		if(i == len) i--;
		
		boolean found = false;
		int l = 0; int r = nums.length-1;
		int mid = (l+r)/2;
		int newmid = -1;
		while(l<=r) //search the old sorted array
		{
			//int newl = (l+i)/(len-1);
			//int newr = (r+i)/(len-1);
			newmid = (mid+i+1)%(len);
			if(nums[newmid]==target)
			{	found = true; break;}
			else if(nums[newmid]<target)
			{
				 l = mid+1;
				 mid = (l+r)/2;
			}
			else
			{
				r = mid-1;
				mid = (l+r)/2;
			}
		}
		//to new pos
		if(found) return newmid;
		else return -1;
	}
}
