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
  	public List<List<Integer>> pathSum(TreeNode root, int sum)
	{
		List<Integer> ans = new ArrayList<>();
		List<List<Integer>> res = new ArrayList<>();
		findSum(res,ans,root,sum);
		return res;
	}

	private void findSum(List<List<Integer>> res, List<Integer> ans, TreeNode root, int sum)
	{
		if(root == null)
			return;
		sum = sum - root.val;
		ans.add(root.val);
		if(sum==0 && root.left==null && root.right==null)
		{
			List<Integer> temp = new ArrayList<>(ans);
			res.add(temp);
			ans.remove(ans.size()-1);
			return;
		}
		findSum(res, ans, root.left, sum);
		findSum(res, ans, root.right, sum);
		ans.remove(ans.size()-1);
		
	}
}
