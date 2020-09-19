public class Solution {
    public ArrayList<Integer> getRow(int A) 
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        ans.add(a);
        for(int i=1;i<=A;i++)
        {
            a=new ArrayList<>();
            for(int j=0;j<i;j++)
            {
                if(j==0)
                {
                    a.add(1);
                }
                else
                {
                    a.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
            a.add(1);
            ans.add(a);
        }
        return ans.get(A);
    }
}
