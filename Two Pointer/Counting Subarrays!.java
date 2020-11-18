public class Solution {
    public int solve(ArrayList<Integer> A, int B)
    {
        int n=A.size();
        int sum;
        int count=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+A.get(j);
                if(sum<B)
                {
                    count++;
                   
                }
                else
                    break;
            }
        }
        return count;
    }
}
