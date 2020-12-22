public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        HashMap<Integer, Integer> ind=new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            if(!ind.containsKey(A.get(i)))
            {
                ind.put(A.get(i),i);
            }
        }
        for(int i=0;i<A.size();i++)
        {
            map.put(A.get(i),map.getOrDefault(A.get(i),0)+1);
        }
        int ans=Integer.MAX_VALUE;
        for(int i:map.keySet())
        {
            if(map.get(i)>=2)
            {
                ans=Math.min(ans,ind.get(i));
            }
        }
        return ans==Integer.MAX_VALUE?-1:A.get(ans);
    }
}
