public class Solution {
    public int solve(ArrayList<Integer> A, int B) 
    {
        int ans=0;
        HashSet<Integer> map=new HashSet<>();
        for(int i:A)
        {
            if(map.contains(i^B))
            {
                ans++;
                map.remove(i^B);
            }
            else
            {
                map.add(i);
            }
        }
        return ans;
    }
}
