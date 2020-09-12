public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) 
    {
        int max=A.get(0);
        int ans=max;
        for(int i=1;i<A.size();i++)
        {
            int a=A.get(i);
            max=Math.max(max+a,a);
            ans=Math.max(max,ans);
        }
        return ans;
    }
}
