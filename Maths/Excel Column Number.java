public class Solution {
    public int titleToNumber(String A) 
    {
        long ans=0;
        for(char c:A.toCharArray())
        {
            ans=ans*26+(long)(c-'A'+1);
        }
        return (int)ans;
    }
}
