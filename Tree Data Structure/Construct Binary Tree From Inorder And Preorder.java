public class Solution 
{
    HashMap<Integer,Integer> ht=new HashMap<Integer,Integer> ();
    int preindex=0;
    public TreeNode buildTree(int[] A, int[] B) 
    {
        for(int i=0;i<B.length;i++)
            ht.put(B[i],i);
        return build(A,B,0,A.length-1);
    }
    public TreeNode build(int[] A,int[] B,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        TreeNode root=new TreeNode(A[preindex++]);
        if(start==end)
        {
            return root;
        }
        int index=ht.get(root.val);
        root.left=build(A,B,start,index-1);
        root.right=build(A,B,index+1,end);
        return root;
    }
    
}