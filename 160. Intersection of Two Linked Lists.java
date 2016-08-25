/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
{

	
	 public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int lenA = 0;
		int lenB = 0;
		ListNode pa = headA;
		ListNode pb = headB;
		if(pa==null||pb==null)
		    return null;
		while(pa.next!=null) 
		{
			lenA++;
			pa = pa.next;
		}
		while(pb.next!=null) 
		{
			lenB++;
			pb = pb.next;
		}
		
		if(pb!=pa) return null;
		
		int diff = lenA - lenB;
		pa = headA;
		pb = headB;
		if(diff>0)
		{
			while(diff-->0)
				pa = pa.next;
		}
		else
			while(diff++<0)
				pb = pb.next;
		
		while(pa!=pb)
		{
			pa = pa.next;
			pb = pb.next;
		}
		return pa;
		
	        
	    }
	

}
