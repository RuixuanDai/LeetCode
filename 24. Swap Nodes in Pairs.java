/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   	public static ListNode swapPairs(ListNode head)
	{
		ListNode pre = new ListNode(0x8000);
		pre.next = head;
		ListNode pos = head, last = pre;
		if(pos == null || pos.next == null) return head;
		while(pos.next!=null)
		{
			last.next = pos.next;
			pos.next = pos.next.next;
			last.next.next = pos;
			last = pos;
			if(pos.next!=null) pos = pos.next;
		}
		return pre.next;		
	}
}
