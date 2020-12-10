public class Solution {
    public int solve(String A) 
    {
        int ar[]=new int[26];
        for(char c:A.toCharArray())
        {
            ar[c-'a']++;
        }
        int odd=0;
        for(int i:ar)
        {
            if(i%2==1)
            {
                odd++;
            }
            if(odd>1)
            {
                return 0;
            }
        }
        return 1;
    }
}
