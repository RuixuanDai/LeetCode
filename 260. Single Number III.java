public class Solution {
   	public static int[] singleNumber(int[] nums)
	{
		Set<Integer> hash = new HashSet<>();
		int len = nums.length;
		for(int i=0 ; i<len ; i++)
		{
			if(hash.contains(nums[i]))
			{
				hash.remove(nums[i]);
				continue;
			}
			hash.add(nums[i]);
		}
		int[] result = new int[2];
		Iterator<Integer> ii = hash.iterator();
		result[0] = ii.next();
		result[1] = ii.next();
		
		return result;
			
	}
}
