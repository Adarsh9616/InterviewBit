public class Solution {
    public String solve(String A, int B) 
    {
        if(A.length()==0)
        {
            return "";
        }
        int count=1;
        A=A+"#";
        char c=A.charAt(0);
        StringBuilder str=new StringBuilder("");
        for(int i=1;i<A.length();i++)
        {
            if(A.charAt(i)==c)
            {
                count++;
            }
            else
            {
                int k=count%B;
                for(int j=0;j<k;j++)
                {
                    str.append(c);
                }
                count=1;
                c=A.charAt(i);
            }
        }
        return str.toString();
    }
}
