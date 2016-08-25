/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
 	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode pre = new ListNode(0x80000000);
		if(pre.val == head.val) pre.val += 1;
		pre.next = head;
		ListNode pos = head;
		ListNode last = pre;
		boolean duplicate = false;
		
		
		while(pos!=null && pos.next!=null)
		{
			while(pos.next!=null&&pos.val == pos.next.val)
			{
				duplicate = true;
				pos = pos.next;
			}
			if(duplicate)
			{
				last.next = pos.next;
				pos=pos.next;
				duplicate = false;
			}
			else
			{
				//last.next = pos.next;
				last = pos;
				pos = pos.next;
			}
			
		}
		return pre.next;
    }
}
