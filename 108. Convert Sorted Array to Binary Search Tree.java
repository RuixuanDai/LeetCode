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
   public TreeNode sortedArrayToBST(int[] nums)
	{
		if(nums.length == 0) return null;
		
		return arrayToBst(nums, 0, nums.length-1);
	}

	private TreeNode arrayToBst(int[] nums, int l, int r)
	{
		if(l>r) return null;
		int mid = (l+r)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = arrayToBst(nums, l, mid-1);
		root.right = arrayToBst(nums, mid+1, r);
		return root;
	}
}
