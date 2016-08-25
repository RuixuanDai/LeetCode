public class Solution {
    public int singleNumber(int[] nums)
	{
		int result = 0;
		int count = 0;
		for(int i=0 ; i<32 ; i++)
		{
			count = 0;
			int mask = 1<<i;
			for(int num : nums)
			{
				if((num&mask)==mask) count++;
			}
			if(count%3==1) result |= mask;
		}
		return result;
	}
}
