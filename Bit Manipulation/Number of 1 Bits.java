public class Solution {
    public int numSetBits(long a) 
    {
        int count=0;
        for(int i=63;i>=0;i--)
        {
            if(((a>>i)&1)!=0)
            {
                count++;
            }
        }
        return count;
    }
}
