public class Solution {
    public int solve(int[] A, int B) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int res=0;
        int oddCount=0;
        for(int i:A)
        {
            oddCount+=i%2;
            if(map.containsKey(oddCount-B))
            {
                res+=map.get(oddCount-B);
            }
            map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return res;
    }
}
