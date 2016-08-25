/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public static ListNode rotateRight(ListNode head, int k)
	{
		ListNode last,pos;
		pos = head;
		if(pos == null || k==0) return head;
		int len = 1;
		while(pos.next!=null)
			{pos = pos.next; len++;}
		k %= len;
		int times = len-k;
		if(times == 0) return head;
		
		pos.next = head;
		while(--times>0)
		{
			head = head.next;
		}
		last = head;
		head = head.next;
		last.next = null;
		return head;
		
	}
}
