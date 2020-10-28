public class Solution {
    public int solve(int A) 
    {
        int count=0;
        for(int i=0;i<=31;i++)
        {
            if(((A>>i)&1)==0)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
