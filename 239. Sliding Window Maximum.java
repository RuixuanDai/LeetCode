public class Solution {
   public static int[] maxSlidingWindow(int[] nums, int k)
	{
		Deque<Integer> d = new ArrayDeque<>(k);		
		int len = nums.length;
		if(len<=0) return nums;
		int[] res = new int[len-k+1];				
		
		/*d.addLast(0);
		if(nums[0]<nums[1])
		{
			d.removeLast();
			d.addLast(1);
		}
		else d.addLast(1);*/
		
		for(int i=0 ; i<len ; i++)
		{
			while(!d.isEmpty()&&nums[i]>nums[d.getLast()])
			{
				d.removeLast();
				
			}
			d.addLast(i);
			if(i>=k-1)
			{
				res[i-k+1] = nums[d.getFirst()];
				if(d.getFirst()<=i-k+1)
					d.removeFirst();
			}
		}
		
		
		return res;
	}
}
