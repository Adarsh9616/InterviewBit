public class Solution 
{
    boolean check(char c)
    {
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        {
            return true;
        }
        return false;
    }
    public int solve(String A) 
    {
        long ans=0;
        for(int i =0;i<A.length();i++)
        {
            if(check(A.charAt(i)))
            {
                ans+=(A.length()-i);
            }
        }
        return (int)(ans%10003);
    }
}
