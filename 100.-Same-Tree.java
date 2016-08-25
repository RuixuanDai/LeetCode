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
    public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean flag1 = false, flag2 = false;
		if(p==q) return true;
		if(p==null || q==null) return false;
		flag1 = isSameTree(p.left, q.left);
		if(p.val!=q.val) return false;
		flag2 = isSameTree(p.right, q.right);
		
		return flag1&&flag2;
	}
}
