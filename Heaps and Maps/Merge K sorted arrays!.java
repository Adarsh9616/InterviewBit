public class Solution
{
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A)
    {
        ArrayList<Integer> res=new ArrayList();
        PriorityQueue<Integer> pq=new PriorityQueue();
        for(ArrayList<Integer> al:A)
            pq.addAll(al);
        while(pq.size()!=0)
            res.add(pq.poll());
        return res;
    }
}