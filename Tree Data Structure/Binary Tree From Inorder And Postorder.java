public class Solution
{
    HashMap<Integer,Integer> ht=new HashMap<Integer,Integer> ();
    int preindex=0;
    public TreeNode buildTree(int[] A, int[] B)
    {
        for(int i=0;i<A.length;i++)
            ht.put(A[i],i);
        
        int[] revB=new int[B.length]; 
        for(int i=0;i<B.length;i++)
        { 
            revB[i]=B[B.length-1-i];
            
        }
        return build(A,revB,0,A.length-1);
    }
    public TreeNode build(int[] A,int[] revB,int start,int end)
    {
        if(start>end)
        {
            return null;
            
        }
        TreeNode root=new TreeNode(revB[preindex++]);
     
        if(start==end)
        { 
            return root;
        }
        int index=ht.get(root.val);
        root.right=build(A,revB,index+1,end);
        root.left=build(A,revB,start,index-1);
        return root;
    }
}