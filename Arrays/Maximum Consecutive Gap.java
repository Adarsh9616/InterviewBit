public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) 
    {
        int n=A.size();
        if(n<2)
        {
            return 0;
        }
        PriorityQueue<Integer> pr=new PriorityQueue<>();
        for(int i:A)
        {
            pr.add(i);
        }
        int max=-1;
        int a=pr.poll();
        while(!pr.isEmpty())
        {
            int b=pr.poll();
            if(b-a>max)
            {
                max=b-a;
            }
            a=b;
        }
        return max;
    }
}
