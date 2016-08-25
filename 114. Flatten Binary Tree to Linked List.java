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
 public void flatten(TreeNode root)
{    while(root != null)
		{
			TreeNode rightmost = null;
			if(root.left!=null)
			{
				rightmost = root.left;
				while (rightmost.right != null)
					rightmost = rightmost.right;
				rightmost.right = root.right;
				root.right = root.left;
				root.left = null;
			}
			root = root.right;
		}
	}
}

