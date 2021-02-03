public class Solution 
{
    ArrayList list = new ArrayList<>();
    public void utils(TreeNode root)
    {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode currNode = q.poll();
            while(currNode!=null)
            {
                list.add(currNode.val);
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                currNode = currNode.right;
            }
        }
    }
    public ArrayList solve(TreeNode root) 
    {
        utils(root);
        return list;
    }
}