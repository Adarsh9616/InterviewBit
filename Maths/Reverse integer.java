public class Solution {
    public int reverse(int A) 
    {
        int sign=A<0?-1:1;
        int temp=Math.abs(A);
        long x=0;
        while(temp>0)
        {
            x=x*10+temp%10;
            temp/=10;
            if(x>=Integer.MAX_VALUE||x<=Integer.MIN_VALUE)
            {
                return 0;
            }
        }
        
        return (int)x*sign;
    }
}
