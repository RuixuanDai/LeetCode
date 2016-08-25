public class Solution {
   public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<>();
		int times = 1<<n;
		for(int i=0 ; i<times ; i++)
		{
			result.add(i^(i>>1));
		}
		return result;
	}
}
