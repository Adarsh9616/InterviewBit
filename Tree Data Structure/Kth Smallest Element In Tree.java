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
    public int kthsmallest(TreeNode A, int B) 
    {
        solve(A);
        return ans.get(B-1);
    }
    void solve(TreeNode A)
    {
        if(A==null)
        {
            return;
        }
        solve(A.left);
        ans.add(A.val);
        solve(A.right);
    }
}
