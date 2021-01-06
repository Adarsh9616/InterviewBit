public class Solution 
{
    public int solve(ArrayList<Integer> A, int B) 
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(A);
        int sum=0;
        for(int i=0;i<B;i++)
        {
            int p=pq.poll();
            sum+=p;
            pq.add(p-1);
        }
        return sum;
    }
}