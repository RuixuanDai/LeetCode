public class Solution {
   public List<String> summaryRanges(int[] nums) 
	 {
	        List<String> result = new ArrayList<>();
	        int len  = nums.length;
	        
	        if(len==0) return result;
	        if(len==1) {result.add(""+nums[0]);return result;}
	        //int end;
	        int start = nums[0];
	        int inc = 0;
	        for(int i=1 ; i<len ; i++)
	        {
	        	if(nums[i] != start+(++inc))
	        	{	 
	        		if(inc==1)result.add(""+start);
	        		else
	        		{
	        			result.add(""+start+"->"+(start+inc-1));
	        		}        		
	        		inc = 0;
	        		start = nums[i];
	        	}	        		
	        }
	        if(++inc==1)result.add(""+start);
    		else
    		{
    			result.add(""+start+"->"+(start+inc-1));
    		}        		
    		inc = 0;
	        return result;
	 }
}
