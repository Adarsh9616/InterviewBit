/**

Definition for binary tree
public class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode(int x) { val = x; }
}
*/
public class Solution {
TreeNode root;

public Solution(TreeNode root) {
    this.root= root;
}

/** @return whether we have a next smallest number */
public boolean hasNext() {
    if(root==null){
        return false;
    }
    return true;
}

/** @return the next smallest number */
public int next() {
    if(root.left==null){
        int temp=root.val;
        root=root.right;
        return temp;
    }
    TreeNode pre= root;
    TreeNode succ=root.left;
    while(succ.left!=null){
        pre=pre.left;
        succ=succ.left;
    }
    if(succ.right==null){
        pre.left=null;
        return succ.val;
    }
    else if(succ.right!=null){
        pre.left=succ.right;
        return succ.val;
    }
    return 0;
}
}