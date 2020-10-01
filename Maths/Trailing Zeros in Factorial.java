public class Solution {
    public int trailingZeroes(int A) 
    {
        int k=0;
        int i =1;
        while(A/Math.pow(5,i)>0)
        {
            k+=A/Math.pow(5,i);
            i++;
        }
        return k;
    }
}
