public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) 
    {
        long sum=0;
        int n=A.size();
        long mod=1000000007;
        for(int i=31;i>=0;i--)
        {
            int setBit=0;
            for(int j:A)
            {
                setBit+=((j>>i)&1)==0?0:1;
            }
            sum=((sum%mod)+((setBit%mod)*((n-setBit)%mod)*(2%mod))%mod)%mod;
        }
        return (int)(sum%mod);
    }
}
