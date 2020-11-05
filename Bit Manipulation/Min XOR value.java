public class Solution {
    public int findMinXor(int[] A) 
    {
        Arrays.sort(A);
        int max=Integer.MAX_VALUE;
        for(int i=0;i<A.length-1;i++)
        {
            int tem=A[i]^A[i+1];
            max=Math.min(tem,max);
        }
        return max;
    }
}
