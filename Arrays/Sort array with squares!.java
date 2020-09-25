public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) 
    {
        int pivot=-1;
        int n=A.size();
        for(int i=0;i<n;i++)
        {
            if(A.get(i)>=0)
            {
                pivot=i;
                break;
            }
        }
        int l=pivot-1;
        int r=pivot;
        ArrayList<Integer> ans=new ArrayList<>();
        while(l>=0||r<n)
        {
            int left=(l<0)?Integer.MAX_VALUE:A.get(l)*A.get(l);
            int right=(r>=n)?Integer.MAX_VALUE:A.get(r)*A.get(r);
            if(left<right)
            {
                ans.add(left);
                l--;
            }
            else if(right<left)
            {
                ans.add(right);
                r++;
            }
            else
            {
                ans.add(left);
                ans.add(right);
                l--;
                r++;
            }
        }
        return ans;
    }
}
