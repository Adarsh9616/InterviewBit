public class Solution {
    public int solve(ArrayList<Integer> A, int B)
    {
        int i=0;
        int j=0;
        int max=0;
        for(i=0;i<A.size();i++) 
        {
            if(A.get(i)==0) 
            {
                B--;
            }
            while(j<=i && B<0) 
            {
                if(A.get(j)==0) 
                {
                    B++;
                }
                j++;
            }
            max=Math.max(max, i-j+1);
        }
    return max;
    }
}
