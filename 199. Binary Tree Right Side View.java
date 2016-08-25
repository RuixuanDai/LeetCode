/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
   public List<Integer> rightSideView(TreeNode root)
	{
		List<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		Deque<TreeNode> dq = new ArrayDeque<>();
		dq.addLast(root);
		while(!dq.isEmpty())
		{
			TreeNode rightmost = dq.peekLast();
			result.add(rightmost.val);
			int size = dq.size();
			for(int i=0 ; i<size ; i++)
			{
				TreeNode temp = dq.pop();
				if(temp.left!=null)
					dq.addLast(temp.left);
				if(temp.right!=null)
					dq.addLast(temp.right);
			}
			
		}		
		return result;
		
	}
}
