public class Solution {
    public ArrayList<Integer> allFactors(int A) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(A==1)
        {
            ans.add(1);
            return ans;
        }
        for(int i=1;i*i<=A;i++)
        {
            if(A%i==0)
            {
                ans.add(i);
                if(i*i!=A)
                {
                    ans.add(A/i);
                }
            }
            
        }
        Collections.sort(ans);
        return ans;
    }
}
