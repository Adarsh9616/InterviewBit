public class Solution {
    public int isPower(int A) 
    {
        if(A<=1)
        {
            return 1;
        }
        double p=1;
        for(int i=2;i<=Math.sqrt(A);i++)
        {
            p=Math.log10(A)/Math.log10(i);
            if(Math.floor(p)==Math.ceil(p)&&p>1)
            {
                return 1;
            }
        }
        return 0;
    }
}
