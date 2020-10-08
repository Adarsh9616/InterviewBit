public class Solution {
    public int solve(int A) 
    {
        if(A==1)
        {
            return 1;
        }
        if(A==2)
        {
            return 1;
        }
        return (int)findNthTerm(A)%1000000007;
    }
    long findNthTerm(int n) 
    { 
        long F[][] = {{1, 1}, {1, 0}}; 
      
        return power(F, n-2)%1000000007; 
    } 
    long power(long F[][], int n) 
    { 
        long M[][] = {{1, 1}, {1, 0}}; 

        if (n == 1) 
            return F[0][0] + F[0][1]; 
      
        power(F, n / 2); 
      
        multiply(F, F); 
      
        if (n%2 != 0) 
            multiply(F, M); 
            
        return (F[0][0]%1000000007 + F[0][1]%1000000007)%1000000007 ; 
    } 
    void multiply(long a[][], long b[][]) 
    { 
        long mul[][] = new long[3][3]; 
        for (int i = 0; i < 2; i++) 
        { 
            for (int j = 0; j < 2; j++) 
            { 
                mul[i][j] = 0; 
                for (int k = 0; k < 2; k++) 
                    mul[i][j] += (a[i][k]%1000000007 
                                * b[k][j]%1000000007)%1000000007; 
            } 
        } 
        for (int i=0; i<2; i++) 
            for (int j=0; j<2; j++) 
                a[i][j] = mul[i][j];  
    } 
}
