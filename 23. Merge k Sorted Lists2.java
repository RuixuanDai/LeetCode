/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
   public ListNode mergeKLists(ListNode[] lists)
	{
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>()
		{
			public int compare(ListNode o1, ListNode o2)
			{
				return o1.val-o2.val;
			}
		});
		for(ListNode l : lists){
			if(l!=null)
				pq.add(l);
		}
		ListNode pre = new ListNode(Integer.MIN_VALUE);
		ListNode pos = pre;
		while(!pq.isEmpty())
		{
			pos.next = pq.poll();
			if(pos.next.next!=null)
				pq.add(pos.next.next);
			pos = pos.next;			
		}
		return pre.next;
	}
}
