/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   	public ListNode reverseList(ListNode head)
	{
		if(head == null || head.next == null) return head;
		ListNode pre = new ListNode(Integer.MIN_VALUE);
		pre.next = head;
		ListNode pos = head.next;
		while(pos!=null)
		{
			head.next = pos.next;
			pos.next = pre.next;
			pre.next = pos;
			pos = head.next;
		}
		return pre.next;
	}
}
