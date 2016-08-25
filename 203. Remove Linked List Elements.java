/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   public static ListNode removeElements(ListNode head, int val)
	{
		ListNode pre = new ListNode(val+1);
		if(head == null) return head;
		pre.next = head;
		ListNode pos = head, last = pre;
		while(pos!=null)
		{
			if(pos.val == val)
			{
				last.next = pos.next;
			}
			else
				last = pos;
			pos = pos.next;
		}
		return pre.next;
	}
}
