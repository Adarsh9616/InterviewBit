public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) 
    {
        int lastMax=0;
        ArrayList<Integer> ans=new ArrayList<>();
        int n=A.size()-1;
        while(n>=0)
        {
            int temp=A.get(n);
            if(temp>lastMax)
            {
                ans.add(temp);
                lastMax=temp;
            }
            n--;
        }
        return ans;
    }
}
