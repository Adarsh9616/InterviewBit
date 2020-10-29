public class Solution {
    public int solve(int A) 
    {
        A=A+1;
        long ans=A/2;
        long pow=2;
        long mod=1000000007;
        while(pow<=A)
        {
            long bar=A/pow;
            long setBits=bar/2;
            ans+=(setBits*pow)%mod;
            long residueBits=bar%2!=0?A%pow:0;
            ans+=residueBits%mod;
            pow=pow<<1;
        }
        return (int)(ans%mod);
    }
}
