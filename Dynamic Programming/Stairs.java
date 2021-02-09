public class Solution {
int[] dp;
public int climbStairs(int A) {
dp = new int[A+1];
Arrays.fill(dp,-1);
return climb(A);

}

public int climb(int n){
    if(n<0){return 0;}
    if(n == 0){return 1;}
    
    if(dp[n] != -1){return dp[n];}
     dp[n] = climb(n-1); 
    
    if(n >= 2){dp[n] += climb(n-2);}
    
    return dp[n];
}
}
