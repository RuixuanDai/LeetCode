/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
 public  ListNode reverseKGroup(ListNode head, int k) 
	{	
		if(head == null) return head;
		
		ListNode pre = new ListNode(-1);
		ListNode p = head;
		ListNode t;
		ListNode start = head;
		pre.next = head;
		boolean first = true;
		int count = 0;
		while(p != null)
		{
			p = p.next;
			count++;
			if(count == k)
			{
				t = start.next;
				count --;
				while(count>0)
				{
					start.next = t.next;
					t.next = pre.next;
					pre.next = t;
					t = start.next;
					count--;					
				}
				if(first)
				{
					head = pre.next; first = false;
				}
				pre = start;
				start = p;				
			}
			//return head;
			
			
			
		}
		
		
		
		return head;
		
    }
}
