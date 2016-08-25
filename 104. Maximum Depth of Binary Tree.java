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
    public int maxDepth(TreeNode root) 
    {
        TreeNode p = root;
        if(p == null) return 0;
        if(p.left!=null&&p.right!=null)
        {
            return 1+max(maxDepth(p.left),maxDepth(p.right));
        }
        else if(p.left!=null)
            return 1+maxDepth(p.left);
        else if(p.right!=null)
            return 1+maxDepth(p.right);
        else
            return 1;
    }
    private int max(int a, int b)
    {
        if(a>=b)
            return a;
        else
            return b;
    }
}
