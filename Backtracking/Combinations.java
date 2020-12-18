public class Solution 
{
    ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
    public ArrayList<ArrayList<Integer>> combine(int A, int B) 
    {
        solve(A,B,1,new ArrayList<Integer>());
        return ans;
    }
    public void solve(int A, int B,int k,ArrayList<Integer> temp)
    {
        if(temp.size()==B)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=k;i<=A;i++)
        {
            temp.add(i);
            solve(A,B,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
