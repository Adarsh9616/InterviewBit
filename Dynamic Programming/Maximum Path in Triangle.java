public class Solution {
public int solve(int[][] A) {
int n=A.length;
int dp[][]=new int[n][n];
dp[0][0]=A[0][0];
for(int i=1;i<n;i++){
for(int j=0;j<=i;j++){
if(j==0){
dp[i][j]=dp[i-1][j]+A[i][j];
}else{
dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1])+A[i][j];
}
}
}
int max=dp[n-1][0];
for(int i=1;i<n;i++){
if(dp[n-1][i]>max){
max=dp[n-1][i];
}
}
return max;
}
}