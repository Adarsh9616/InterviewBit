public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C)
    {
        int sum=0;int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i:A)
        {
            if(i==B)
            {
                sum+=1;
            }
            else if(i==C)
            {
                sum+=-1;
            }
            ans+=map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
