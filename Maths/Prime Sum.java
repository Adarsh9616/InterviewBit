public class Solution {
    public ArrayList<Integer> primesum(int A) 
    {
        boolean ar[]=new boolean[A+1];
        Seive(A,ar);
        for(int i=0;i<=A;i++)
        {
            if(!ar[i]&&!ar[A-i])
            {
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(i);
                ans.add(A-i);
                return ans;
            }
        }
        return new ArrayList<>();
    }
    public void Seive(int A,boolean ar[])
    {
        ar[0]=true;
        ar[1]=true;
        for(int i=2;i<=A;i++)
        {
            if(!ar[i])
            {
                for(int j=2*i;j<=A;j+=i)
                {
                    ar[j]=true;
                }
            }
        }
    }
}
