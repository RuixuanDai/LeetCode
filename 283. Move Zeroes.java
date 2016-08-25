public class Solution {
	public void moveZeroes(int[] nums) 
	{
        int len = nums.length;
        int p1 = 0;
        boolean firstZero = true;
                
        int temp;
        
        for(int i=0 ; i<len ; i++)
        {
        	
        	if(nums[i]==0)
        	{
        		if(firstZero)
        		{
        			p1 = i;
        			firstZero = false;
        		}       		
        	}
        	else
        	{
        		temp = nums[i];
        		nums[i] = nums[p1];
        		nums[p1] = temp;
        		p1++;
        	}
        }
        
        
    }
}
