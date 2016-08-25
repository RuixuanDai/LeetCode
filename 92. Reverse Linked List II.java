/**
 *    this solution uses O(n) space, not perfect
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   	public static ListNode reverseBetween(ListNode head, int m, int n) {
		
		if(head == null)
			return null;
		
		ListNode[] c = new ListNode[n-m+1];
		int start = m;
		int stop = n;
		int i = 0;
		ListNode p = head;
		ListNode pre = head;
		while(--start>0)
		{
			pre = p;
			p = p.next;
		}
		
		while(stop-->=m)
		{
			c[i++] = p;
			p = p.next;
		}
		if(m == 1)
		{
			pre = c[n-m];
			head = pre;
		}
		else pre.next = c[n-m];
		for(int j = n-m-1; j>=0 ; j--)
		{
			c[j+1].next = c[j];
		}
		c[0].next = p;
				
		return head;
        
    }
}
