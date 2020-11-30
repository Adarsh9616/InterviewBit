public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) 
    {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        int i;
        for(i=0;i<B;i++)
        {
            q.add(A.get(i));
        }
        for(;i<A.size();i++)
        {
            if(q.peek()>A.get(i))
            {
                q.poll();
                q.add(A.get(i));
            }
        }
        return q.poll();
    }
}
