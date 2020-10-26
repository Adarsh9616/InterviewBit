public class Solution {
    public int pow(int x, int n, int d) 
    {
        if(x==0)
        {
            return 0;
        }
        int t=power(x,n,d);
        if(t<0)
        {
            return (t%d)+d;
        }
        else
        {
            return t;
        }
    }
    int power(long a,long b, int mod) 
    {
     	if (b == 0)
    		return 1;
    
     	long res = power(a, b / 2, mod);
    	res = (res * res) % mod;
    	
    	if (b % 2!=0)
    		res = (res * a) % mod;
    
    	return (int)res;
    }
}
