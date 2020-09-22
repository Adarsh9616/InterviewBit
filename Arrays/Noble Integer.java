public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        Collections.sort(A);
        int n=A.size();
        if(A.get(n-1)==0)
        {
            return 1;
        }
        for(int i=0;i<n-1;i++)
        {
            int pos=i;
            int num=A.get(i);
            if(num==n-(pos+1)&&num>0&&num!=A.get(i+1))
            {
                return 1;
            }
        }
        return -1;
    }
}
