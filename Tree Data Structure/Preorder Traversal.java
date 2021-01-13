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
    public ArrayList<Integer> preorderTraversal(TreeNode A) 
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
        ans.add(A.val);
        solve(A.left);
        solve(A.right);
    
    }
}
