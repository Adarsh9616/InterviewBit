public class Solution
{
    public int lca(TreeNode root, int n1, int n2)
    {
        if(search(root,n1)&&search(root,n2))
        {
            return LCA(root,n1,n2).val;
        }
        return -1;
    }
    public TreeNode LCA(TreeNode root, int n1, int n2)
    {
        if(root==null||root.val==n1||root.val==n2)
            return root;
        TreeNode left=LCA(root.left,n1,n2);
        TreeNode right=LCA(root.right,n1,n2);
        if(left!=null&&right!=null) 
            return root;
        
        return left!=null?left:right;
    }
    public boolean search(TreeNode root,int x)
    {
        if(root==null)
        {
            return false;
        }
        if(root.val==x)
        {
            return true;
        }
        return (search(root.left,x)||search(root.right,x));
    }
}