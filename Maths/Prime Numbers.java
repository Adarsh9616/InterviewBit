public class Solution {
    public ArrayList<Integer> sieve(int A) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean ar[]=new boolean[A+1];
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i*i<=A;i++)
        {
            if(!ar[i])
            {
                for(int j=2*i;j<=A;j+=i)
                {
                    ar[j]=true;
                }
            }
        }
        for(int i=0;i<=A;i++)
        {
            if(!ar[i])
            {
                ans.add(i);
            }
        }
        return ans;
        
    }
}
