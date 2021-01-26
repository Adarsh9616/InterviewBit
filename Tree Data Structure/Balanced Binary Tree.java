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
    public int isBalanced(TreeNode root){
        if( root == null)
        {
            return 1;
        }

        if( root.left == null && (root.right != null && (root.right.right != null || root.right.left != null)))
        {
            return 0;
        }

        if( root.right == null && (root.left != null && (root.left.right != null || root.left.left != null))){
            return 0;
        }
        return Math.min(isBalanced(root.left), isBalanced(root.right));
    }
}
