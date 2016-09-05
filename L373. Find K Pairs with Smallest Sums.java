public class Solution {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> list = new ArrayList<int[]>();
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0 || k == 0) 
            return list;
        Comparator<int[]> cmp = new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                int sum1 = nums1[a[0]] + nums2[a[1]];
                int sum2 = nums1[b[0]] + nums2[b[1]];
                return sum1 - sum2;
            }
        };
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(cmp);
        for(int i = 0; i < nums1.length; i++) {
            q.add(new int[]{i, 0});
        }
        while(!q.isEmpty() && list.size() < k) {
            int[] ind = q.poll();
            list.add(new int[]{nums1[ind[0]], nums2[ind[1]]});
            ind[1]++;
            if(ind[1] != nums2.length) q.add(ind);
        }
        return list;
    }
}
