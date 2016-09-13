
public class L142_Linked_List_Cycle_II
{
	public ListNode detectCycle(ListNode head) {
		//if(head == null) return null;
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				slow = head;
				while(slow!=fast){
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
		return null;
		
	}
	        
	    
}
