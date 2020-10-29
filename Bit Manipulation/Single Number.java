public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) 
    {
        int ans=0;
        for(int i:A)
        {
            ans^=i;
        }
        return ans;
    }
}
