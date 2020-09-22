public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) 
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int n=A.size();
        for(int i=0;i<A.size();i++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int k=0;
            int j=i;
            while(j>=0)
            {
                temp.add(A.get(k++).get(j--));
            }
            ans.add(temp);
        }
        for(int j=1;j<n;j++)
        {
            ArrayList<Integer> temp=new ArrayList<>();
            int k=n-1;
            int i=j;
            while(i<n)
            {
                temp.add(A.get(i++).get(k--));
            }
            ans.add(temp);
        }
        return ans;
    }
}
