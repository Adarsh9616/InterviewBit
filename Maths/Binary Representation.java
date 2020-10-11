public class Solution {
    public String findDigitsInBinary(int A) 
    {
        if(A==0)
        {
            return "0";
        }
        StringBuilder s=new StringBuilder("");
        while(A>0)
        {
            if(A%2!=0)
            {
                s.append(1);
            }
            else
            {
                s.append(0);
            }
            A=A/2;
        }
        return s.reverse().toString();
    }
}
