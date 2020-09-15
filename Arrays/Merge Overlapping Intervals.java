/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution 
{
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) 
    {
        Collections.sort(intervals,(a,b)->a.start-b.start);
        Stack<Interval> s=new Stack<>();
        for(Interval i:intervals)
        {
            if(s.isEmpty()||i.start>s.peek().end)
            {
                s.push(i);
            }
            else
            {
                Interval temp=new Interval();
                temp.start=s.peek().start;
                temp.end=Math.max(s.peek().end,i.end);
                s.pop();
                s.push(temp);
            }
        }
        ArrayList<Interval> ans= new ArrayList<>();
        for(Interval i:s)
        {
            ans.add(i);
        }
        return ans;
        
    }
}
