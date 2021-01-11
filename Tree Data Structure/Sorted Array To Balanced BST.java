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
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public TreeNode sortedArrayToBST(final int[] A) 
    {
        return solve(A,0,A.length-1);
    }
    public TreeNode solve(int A[],int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid=(s+e)/2;
        TreeNode t=new TreeNode(A[mid]);
        t.left=solve(A,s,mid-1);
        t.right=solve(A,mid+1,e);
        return t;
    }
}
