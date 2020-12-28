public class Solution {
    public int solve(int[] A, int B) 
    {
        int lst[]=new int[A.length];
        lst[0]=A[0];
        for(int i=1;i<A.length;i++)
        {
            lst[i]=lst[i-1]^A[i];
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int ans =0 ;
        for(int i=0;i<A.length;i++)
        {
            int temp = lst[i]^B;
            if(map.containsKey(temp))
            {
                ans +=map.get(temp);
            }
            if(B==lst[i])
            {
                ans++;
            }
            if(map.containsKey(lst[i]))
            {
                map.put(lst[i],map.get(lst[i])+1);
            }
            else
            {
                map.put(lst[i],1);
            }
        }
        return ans;
    }
}
