/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public boolean isPalindrome(ListNode head)
	{
		if(head == null || head.next == null) return true;
		ListNode pos = head,mid = head;
		boolean even = false;
		//find the mid
		while(pos.next!=null)
		{
			mid = mid.next;
			pos = pos.next;
			if(pos.next!=null)
				pos = pos.next;
			else
			{
				even = true; break;
			}
		}
		//
		if(!even)
			mid = mid.next;
		//reverse the second part
		ListNode pre = new ListNode(Integer.MIN_VALUE);
		pre.next = mid;
		pos = mid.next;
		while(pos!=null)
		{
			mid.next = pos.next;
			pos.next = pre.next;
			pre.next = pos;
			pos = mid.next;
		}
		mid = pre.next;
		while(mid!=null)
		{
			if(mid.val!=head.val)
				return false;
			mid = mid.next;
			head = head.next;
		}
		return true;
	}
}
