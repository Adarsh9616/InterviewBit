public class Solution {
    public int solve(int[][] A) 
    {
        int dp[]=new int[A.length];
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            dp[i]=1;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(A[j][1]<A[i][0]&&dp[i]<=dp[j])
                {
                    dp[i]=dp[j]+1;
                }
            }
            if(max<dp[i])
            {
                max=dp[i];
            }
        }
        return max;
    }
}
