/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int minDepth(TreeNode A) 
    {
        return inorder(A,1,Integer.MAX_VALUE);
    }
    int inorder(TreeNode curr,int l,int m)
    {
        if(curr.left==null && curr.right==null) return Math.min(l,m);
        if(curr.left!=null)m =Math.min(inorder(curr.left,l+1,m),m);
        if(curr.right!=null)m =Math.min(inorder(curr.right,l+1,m),m);
        return m;
    }
}
