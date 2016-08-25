/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   public void reorderList(ListNode head)
	{
		
		ListNode pos = head, mid = head;
		if(pos == null || pos.next==null || pos.next.next==null) 
			return;
		
		//find the mid 
		boolean even = true;
		while(mid.next!=null&&pos.next!=null){
			mid = mid.next;
			pos = pos.next;
			if(pos.next!=null)
			{
				pos = pos.next;
				even = false;
			}
			even = true;
		}
		if(!even)
			mid = mid.next;
		//reverse the second half
		ListNode pre = new ListNode(Integer.MIN_VALUE);
		pos = mid.next;
		while(pos!=null){
			mid.next = pos.next;
			pos.next = pre.next;
			pre.next = pos;
			pos = mid.next;			
		}
		
		//combine the list
		mid = pre.next;
		pos = head;
		ListNode last;
		while(pos!=null&&mid!=null){
			ListNode temp = pos.next;
			ListNode temp2= mid.next;
			pos.next = mid;
			mid.next = temp;
			pos = temp;
			mid = temp2;

			
		}
		//if(!even)
		//	pos.next = null;
		
	}
}
