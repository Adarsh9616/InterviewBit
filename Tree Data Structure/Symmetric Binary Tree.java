public class Solution 
{
    public int isSymmetricUtil(TreeNode A, TreeNode B) 
    {
        if(A==null && B==null)
        {
            return 1;
        }
        if(A!=null && B!=null)
        {
            return isSymmetricUtil(A.left,B.right) & isSymmetricUtil(A.right,B.left) & ((A.val==B.val)?1:0);
        }
        return 0;
    }
    public int isSymmetric(TreeNode A) 
    {
        if(A==null)
        {
            return 1;
        }
        return isSymmetricUtil(A.left,A.right);
    }
}