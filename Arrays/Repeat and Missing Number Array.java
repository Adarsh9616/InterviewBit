public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) 
    {
        int xor=A.get(0);
        for(int i=1;i<A.size();i++)
        {
            xor=xor^A.get(i);
        }
        for(int i=1;i<=A.size();i++)
        {
            xor=xor^i;
        }
        
        int setBit=xor&~(xor-1);
        int x=0;
        int y=0;
        for(int i=0;i<A.size();i++)
        {
            int a=A.get(i);
            if((a&setBit)!=0)
            {
                x=x^a;
            }
            else
            {
                y=y^a;
            }
        }
        for(int i=1;i<=A.size();i++)
        {
            if((i&setBit)!=0)
            {
                x=x^i;
            }
            else
            {
                y=y^i;
            }
        }
        int j=0;
        for(;j<A.size();j++)
        {
            if(x==A.get(j))
            {
                ArrayList<Integer> ans=new ArrayList<>();
                ans.add(x);
                ans.add(y);
                return ans;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(y);
        ans.add(x);
        return ans;
    }
}
