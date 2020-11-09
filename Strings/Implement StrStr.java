public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int strStr(final String A, final String B) 
    {
            int k= A.indexOf(B);
            return k<0?-1:k;
    }
}
