import java.util.HashMap;
import java.util.Map;

public class Solution
{
	public static void main(String[] args)
	{
		int [] nums = {3,2,4};
		int[] indices = twoSum(nums, 6);
		System.out.println(indices[0]+" "+indices[1]);
	}
	public static int[] twoSum(int[] nums, int target) 
	{
		
		int[] indices = new int[2];
		int len = nums.length;
		Map<Integer,Integer> hash = new HashMap<>();
		for(int i=0 ; i<len ; i++)
		{
			if(hash.get(target-nums[i])==null)
			{
				hash.put(nums[i],i);
			}
			else
			{
				indices[0] = hash.get(target - nums[i]);
				indices[1] = i;
				return indices;
			}
		}


		
		
		return indices;
	
    }
}
