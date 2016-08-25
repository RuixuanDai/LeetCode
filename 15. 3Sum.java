public class Solution {
   public List<List<Integer>> threeSum(int[] nums)
	{
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0 ; i<nums.length-2 ; i++)
		{
			if (i > 0 && nums[i] == nums[i - 1]) // 跳过重复元素
				continue;
			int l = i+1; int r = nums.length-1;
			while(l<r)
			{
				if(nums[i]+nums[r]+nums[l] == 0)
				{
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[l]);
					temp.add(nums[r]);
					while(l++<r&&nums[l] == nums[l-1]);
					while(r--<r&&nums[r] == nums[r+1]);
					res.add(temp);
				}
				else if(nums[i]+nums[r]+nums[l] < 0)
				{
					l++;
				}
				else
				{
					r--;
				}
			}			
		}
		return res;
	}
}
