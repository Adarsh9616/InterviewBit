public class Solution {
    public long reverse(long a) 
    {
        long ans=0;
        for(int i=0;i<=31;i++)
        {
            ans=ans<<1;
            if(((a>>i)&1)!=0)
            {
                ans=ans|1;
            }
            
        }
        return ans;
    }
}
