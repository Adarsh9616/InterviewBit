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
public class Solution 
{
    ArrayList<Integer> ans=new ArrayList<>();
    public ArrayList<Integer> postorderTraversal(TreeNode A) 
    {
        solve(A);
        return ans;
    }
    void solve(TreeNode A)
    {
        if(A==null)
        {
            return;
        }
        solve(A.left);
        solve(A.right);
        ans.add(A.val);
    }
}
