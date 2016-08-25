import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        int len = nums.length;
        //if(len == 1) return nums;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0 ; i<len ; i++)
        {
        	if(m.containsKey(nums[i]))
        		m.put(nums[i], m.get(nums[i])+1);
        	else
        		m.put(nums[i], 1);        		
        }
        //bucketsort
		Deque<Integer>[] sort = new ArrayDeque[nums.length+1];
		for(int key : m.keySet())
		{
			int count = m.get(key);
			if(sort[count]==null)
				sort[count] = new ArrayDeque<>();
			sort[count].add(key);
		}
		List<Integer> res = new ArrayList<>();
		for(int j=sort.length-1 ; j>0&&k>0 ; j--)
		{
			while(sort[j]!=null&&!sort[j].isEmpty()&&k>0)
			{
				res.add(sort[j].pop());
				k--;				
			}			
		}
		return res;
    }	
}
