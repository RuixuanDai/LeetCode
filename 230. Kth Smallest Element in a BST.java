/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
   public int kthSmallest(TreeNode root, int k)
	{
		TreeNode p = root;
		Deque<TreeNode> d = new ArrayDeque<>();
		while(p.left!=null)
		{
			d.push(p);
			p = p.left;  //find the smallest point
		}
		while(k>0&&(p!=null||!d.isEmpty()))
		{
			if(p==null)
			{
				p = d.pop();
				if(--k==0) return p.val;
				p = p.right;
			}
			else
			{
				d.push(p);
				p = p.left;
			}
			
		}
		return p.val;
		
	}
}
