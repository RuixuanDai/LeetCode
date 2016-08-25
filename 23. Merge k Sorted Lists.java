/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) 
   { //using mergesort
		int r = lists.length-1;
		return merge(lists,0,r);		
	}
	private ListNode merge(ListNode[] lists, int l, int r)
	{
		if(l>r) return null;
		if(l == r) return lists[l];
		int mid = (l+r)/2;
		ListNode left = merge(lists,l,mid);
		ListNode right = merge(lists,mid+1,r);
		ListNode pre = new ListNode(Integer.MIN_VALUE);
		ListNode pos = pre; 
		while(left!=null&&right!=null)
		{
			if(left.val>right.val){
				pos.next = right; right = right.next;pos = pos.next;
			}
			else{
				pos.next = left; left = left.next;pos = pos.next;
			}
		}
		while(left!=null){
			pos.next = left; left = left.next;pos = pos.next;
		}
		while(right!=null){
			pos.next = right; right = right.next;pos = pos.next;
		}				
		return pre.next;
	}
}
