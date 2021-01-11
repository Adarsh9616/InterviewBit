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
    public TreeNode invertTree(TreeNode A) 
    {
        if(A==null)
        {
            return null;
        }
        TreeNode tl=invertTree(A.right);
        TreeNode tr=invertTree(A.left);
        A.left=tl;
        A.right=tr;
        return A;
    }
}
