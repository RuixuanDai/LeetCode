public class Solution {
  public static void merge(int[] nums1, int m, int[] nums2, int n) 
	{
        int i,j,p;
        i = m-1; j = n-1; p = m+n -1;
        //int[] res = new int[m+n];
        while(i>=0&&j>=0)
        {
        	if(nums1[i]<nums2[j])
        		nums1[p--] = nums2[j--];
        	else
        		nums1[p--] = nums1[i--];       		
        }
        while(i>=0)
        	nums1[p--] = nums1[i--];
        while(j>=0)
        	nums1[p--] = nums2[j--];
        //nums1 = res;
    }
}
