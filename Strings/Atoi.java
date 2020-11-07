public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int atoi(final String A) 
    {
        long result = 0;
        int sign = 1;
        int i = 0;
        if(A.charAt(0) == '-')
        {
            sign = -1;
            i++;
        }
        if(A.charAt(0) == '+')
        {
            sign = 1;
            i++;
        }
        for(; i<A.length(); i++)
        {
            if((A.charAt(i) - '0' > 9) || (A.charAt(i) - '0' < 0))
            {
                break;
            }
            result = result*10 + A.charAt(i) - '0';
            
            if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            {
                if(sign == 1)
                {
                    return Integer.MAX_VALUE;
                }
                else
                {
                    return Integer.MIN_VALUE;
                }
                
            }
            
        }
        return (int) result*sign;
    }
}
