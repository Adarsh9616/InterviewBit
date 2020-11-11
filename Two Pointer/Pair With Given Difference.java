public class Solution {
    public int solve(int[] A, int B) 
    {
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            if(map.contains(A[i]-B)||map.contains(B+A[i]))
            {
                return 1;
            }
            else
            {
                map.add(A[i]);
            }
        }
        return 0;
    }
}
