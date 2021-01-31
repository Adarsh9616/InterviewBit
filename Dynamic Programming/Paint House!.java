public class Solution {
    public int solve(int[][] A) {
    int n = A.length;
	int[][] dp = new int[2][3];
	int i = 1;
	for (; i <= n;) {
		dp[i%2][0] = Math.min(dp[(i+1)%2][1] + A[i-1][0], dp[(i+1)%2][2] + A[i-1][0]);
		dp[i%2][1] = Math.min(dp[(i+1)%2][0] + A[i-1][1], dp[(i+1)%2][2] + A[i-1][1]);
		dp[i%2][2] = Math.min(dp[(i+1)%2][0] + A[i-1][2], dp[(i+1)%2][1] + A[i-1][2]);
	     i++;
	}
	return Math.min(Math.min(dp[(i-1)%2][0], dp[(i-1)%2][1]), dp[(i-1)%2][2]);
        
    }
}