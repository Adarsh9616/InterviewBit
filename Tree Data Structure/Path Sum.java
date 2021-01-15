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
    public int hasPathSum(TreeNode A, int B) 
    {
        return getAns(A,B,0);
    }
    public int getAns(TreeNode A, int b, int c) 
    {
        if(A.left == null && A.right == null) 
        {
            if(c+A.val == b) return 1;
        }
        if(A.left != null) 
        {
            if(getAns(A.left, b, c+A.val) == 1)
            {
                return 1;
            }
        }
        if(A.right != null) 
        {
            if(getAns(A.right, b, c+A.val) == 1) 
            {
                return 1;
            }
        }
        return 0;
    }
}
