public class Solution {
    public int nchoc(int A, ArrayList<Integer> B) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(B);
        int sum=0;
        int mod=1000000007;
        while(A-->0)
        {
            int k=pq.poll();
            pq.add(k/2);
            sum=(sum%mod+k%mod)%mod;
        }
        return sum%mod;
    }
}
