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
    public ArrayList<Integer> solve(TreeNode A) 
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                ans.add(temp.val);
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
