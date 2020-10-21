public class Solution {
    public int solve(String A) 
    {
        int open=0;
        int close=0;
        for(char c:A.toCharArray())
        {
            if(c=='(')
            {
                open++;
            }
            if(c==')'&&open>0)
            {
                open--;
            }
            else if(c==')')
            {
                close++;
            }
        }
        return Math.abs(open+close);
    }
}
