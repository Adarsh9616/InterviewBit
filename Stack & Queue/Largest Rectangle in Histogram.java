public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A)
    {
        int lse[]=new int[A.size()];
        int rse[]=new int[A.size()];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<A.size();i++)
        {
            while(!s.isEmpty()&&A.get(s.peek())>=A.get(i))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                lse[i]=-1;
            }
            else
            {
                lse[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        for(int i=A.size()-1;i>=0;i--)
        {
            while(!s.isEmpty()&&A.get(s.peek())>=A.get(i))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                rse[i]=A.size();
            }
            else
            {
                rse[i]=s.peek();
            }
            s.push(i);
        }
        int max=0;
        for(int i=0;i<A.size();i++)
        {
            int width=(i-lse[i])+(rse[i]-i)-1;
            max=Math.max(max,width*A.get(i));
        }
        //System.out.println(Arrays.toString(lse));
        //System.out.println(Arrays.toString(rse));
        return max;
    }
}
