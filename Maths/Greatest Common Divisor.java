public class Solution {
    public int gcd(int A, int B) 
    {
        if(B<=0)
        {
            return A;
        }
        if(A>B)
        {
            return gcd(B,A-B);
        }
        else if(B>A)
        {
            return gcd(A,B-A);
        }
        return A;
    }
}
