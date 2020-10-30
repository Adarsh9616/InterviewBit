public class Solution {
    public int solve(int[] A, int[] B, int C) 
    {
        int dp[][]=new int[A.length+1][C+1];
        for(int i=1;i<=A.length;i++)
        {
            for(int j=1;j<=C;j++)
            {
                if(B[i-1]<=j)
                {
                    dp[i][j]=Math.max(A[i-1]+dp[i-1][j-B[i-1]],dp[i-1][j]);
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[A.length][C];
    }
}
