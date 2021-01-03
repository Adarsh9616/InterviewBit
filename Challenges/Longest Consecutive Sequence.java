public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A)
    {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:A)
        {
            map.put(i,true);
        }
        for(int i:A)
        {
            if(map.containsKey(i-1))
            {
                map.put(i,false);
            }
        }
        int m=1;
        int r=1;
        for(int i:map.keySet())
        {
            if(map.get(i))
            {
                int k=i;
                while(map.containsKey(k+1))
                {
                    k++;
                    r++;
                }
                m=Math.max(m,r);
                r=1;
            }
        }
        return m;
        
    }
}
