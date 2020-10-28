public class Solution {
    public int divide(int A, int B) 
    {
        if(A==0)
        {
            return 0;
        }
        
        long a=A;
        long b=B;
        boolean sign=(a<0)^(b<0);
        a=Math.abs(a);
        b=Math.abs(b);
        long temp=0;
        long res=0;
        for(int i=31;i>=0;i--)
        {
            if(temp+(b<<i)<=a)
            {
                temp+=(b<<i);
                res|=1L<<i;
            }
        }
        if(sign)
        {
            res=-1*res;
        }
        if(res<=Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        if(res>=Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        return (int)res;
    }
}
