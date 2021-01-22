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
    public ArrayList<Integer> solve(TreeNode A, int B) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        solve(A,B,ans);
        Collections.reverse(ans);
        return ans;
    }
    public boolean solve(TreeNode A,int B,ArrayList<Integer> ans)
    {
        if(A==null)
        {
            return false;
        }
        if(A!=null&&A.val==B)
        {
            ans.add(B);
            return true;
        }
        if(solve(A.left,B,ans)||solve(A.right,B,ans))
        {
            ans.add(A.val);
            return true;
        }
        return false;
    }
}
