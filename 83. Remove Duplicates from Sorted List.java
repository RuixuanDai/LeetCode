/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
     public ListNode deleteDuplicates(ListNode head) {
	        ListNode pos;
	        ListNode previous = head;
	        
	        if(previous == null || previous.next == null) return head;
	        pos = previous.next;
	        //int temp = previous.val;
	        while(pos!=null)
	        {
	        	if(pos.val == previous.val)
	        	{
	        		previous.next = pos.next;
	        		pos = pos.next;
	        	}
	        	else
	        	{
	        		previous = previous.next;
	        		pos = pos.next;
	        	}
	        }
	        return head;
	    }
	
}
