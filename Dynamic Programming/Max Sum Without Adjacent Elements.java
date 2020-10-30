public class Solution {
    public int adjacent(ArrayList<ArrayList<Integer>> A)
    {
        if(A.get(0).size()==1)
        {
            return Math.max(A.get(0).get(0),A.get(1).get(0));
        }
        int dp[][]=new int[A.size()][A.get(0).size()+1];
        dp[0][1]=A.get(0).get(0);
        dp[1][1]=A.get(1).get(0);
        int max=Integer.MIN_VALUE;
        for(int i=2;i<=A.get(0).size();i++)
        {
            dp[0][i]=Math.max(dp[0][i-1],A.get(0).get(i-1)+Math.max(dp[0][i-2],dp[1][i-2]));
            dp[1][i]=Math.max(dp[1][i-1],A.get(1).get(i-1)+Math.max(dp[0][i-2],dp[1][i-2]));
            max=Math.max(dp[0][i],dp[1][i]);
        }
        return max;
    }
}
