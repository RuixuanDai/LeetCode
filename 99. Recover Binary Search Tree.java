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
   private TreeNode first = null;
	private TreeNode second = null;
	private TreeNode pre = null;
	int last = 0x80000000;//min of integer
	
	
	public void recoverTree(TreeNode root)
	{
		inorder(root);
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}
	private void inorder(TreeNode root)
	{
		if(root==null) return;
		inorder(root.left);
		if(root.val<last)
		{
			if(first == null)
				first = pre;
			//else
				second = root;
		}
		last = root.val;
		pre = root;
		inorder(root.right);		
	}
}
