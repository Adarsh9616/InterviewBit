public class Solution {
    public int solve(String A) 
    {
        int l=longest(A);
        return A.length()-l;
    }
    int longest(String A)
    {
        int i = 0, j = A.length() - 1;
        int idx = j;
        while(i < j)
        {
        if(A.charAt(j)==A.charAt(i))
        {
            i++;j--;
        }
        else if(i == 0) idx = --j;
        else {i = 0; idx = j;}
        }
        return idx + 1;
    }
}
