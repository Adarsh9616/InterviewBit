public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) 
    {
        Stack<Integer> st=new Stack<Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            while(!st.isEmpty()&&A.get(st.peek())>=A.get(i))
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                ans.add(-1);
            }
            else
            {
                ans.add(A.get(st.peek()));
            }
            st.push(i);
        }
        return ans;
    }
}
