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
        if(B==A.val)
        {
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        ArrayList<Integer> ans=new ArrayList<>();
        int flag=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(flag==1)
            {
                for(TreeNode i:q)
                {
                    ans.add(i.val);
                }
                break;
            }
            for(int i=0;i<size;i++)
            {
                TreeNode t=q.poll();
                if(t.left!=null&&t.left.val==B)
                {
                    flag=1;
                    continue;
                }
                if(t.right!=null&&t.right.val==B)
                {
                    flag=1;
                    continue;
                }
                if(t.left!=null)
                {
                    q.add(t.left);
                }
                if(t.right!=null)
                {
                    q.add(t.right);
                }
            }
        }
        return ans;
    }
}
