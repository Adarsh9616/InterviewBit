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
    public TreeNode solve(TreeNode A, TreeNode B) 
    {
        if(A==null)
        {
            return B;
        }
        if(B==null)
        {
            return A;
        }
        TreeNode temp=new TreeNode(A.val+B.val);
        temp.left=solve(A.left,B.left);
        temp.right=solve(A.right,B.right);
        return temp;
    }
}
