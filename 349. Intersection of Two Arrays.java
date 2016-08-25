public class Solution {
   	public int[] intersection(int[] nums1, int[] nums2)
	{
		int len1 = nums1.length;
		Map<Integer,Integer> m = new HashMap<>();
		for(int i=0 ; i<len1 ; i++)
		{
			m.put(nums1[i], 1);
		}
		int len2 = nums2.length;
		ArrayList<Integer> a = new ArrayList<>();
		for(int j=0 ; j<len2 ; j++)
		{
			if(m.containsKey(nums2[j])&&!a.contains(nums2[j]))
				a.add(nums2[j]);
		}
		int[] res = new int[a.size()];
		for(int i=0 ; i<a.size() ; i++)
			res[i] = a.get(i);
		
		return res;
	}
}
