public class Solution {
    public int isPalindrome(int A) 
    {
        int temp=A;
        int x=0;
        while(temp>0)
        {
            x=x*10+temp%10;
            temp/=10;
        }
        if(x==A)
        {
            return 1;
        }
        return 0;
    }
}
