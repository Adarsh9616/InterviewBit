public class Solution {
    public ArrayList<Integer> getRow(int A) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        for(int i=1;i<=A;i++)
        {
            int num=(A+1-i)*ans.get(i-1)/i;
            ans.add(num);
        }
        return ans;
    }
}
