public class Solution {
    public int solve(int A, int B, int C, int D) 
    {
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(A,m.getOrDefault(A,0)+1);
        m.put(B,m.getOrDefault(B,0)+1);
        m.put(C,m.getOrDefault(C,0)+1);
        m.put(D,m.getOrDefault(D,0)+1);
        if(m.size()==2&&m.get(A)==2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
}
