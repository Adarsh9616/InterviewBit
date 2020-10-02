import java.math.*;
public class Solution {
    public String solve(int A) 
    {
        BigInteger fact= BigInteger.ONE;
        for (int i = 2; i <= A; i++)
        {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }
        return fact.toString();
    }
}
