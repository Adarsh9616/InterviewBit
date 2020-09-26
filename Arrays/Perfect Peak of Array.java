public class Solution {
    public int perfectPeak(ArrayList<Integer> A) 
    {
        int n=A.size();
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=A.get(0);
        right[n-1]=A.get(n-1);
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],A.get(i));
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.min(right[i+1],A.get(i));
        }
        for(int i=1;i<n-1;i++)
        {
            if(A.get(i)>left[i-1]&&A.get(i)<right[i+1])
            {
                return 1;
            }
        }
        return 0;
    }
}
