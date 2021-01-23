/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private TreeNode recFlatten(TreeNode head, TreeNode append){
    if (head.right == null && head.left == null){
        if (append != null){
            head.right = append;
        }
        return head;
    }
    if (head.right != null){
        TreeNode toAppend = recFlatten(head.right, append);
        if (head.left != null){
            head.right = recFlatten(head.left, toAppend);
            head.left = null;
        }
    } else { 
        head.right = recFlatten(head.left, append);
        head.left = null;
    }
    return head;
}


public TreeNode flatten(TreeNode a) {
    recFlatten(a, null);
    return a;
}
}
