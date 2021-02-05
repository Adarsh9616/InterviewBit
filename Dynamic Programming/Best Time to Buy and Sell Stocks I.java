public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) 
    {
        if(A.size()<=1)
        {
            return 0;
        }
        int t=A.get(0);
        int ans=0;
        for(int i=1;i<A.size();i++)
        {
            t=Math.min(t,A.get(i));
            ans=Math.max(ans,A.get(i)-t);
        }
        return ans;
    }
}
