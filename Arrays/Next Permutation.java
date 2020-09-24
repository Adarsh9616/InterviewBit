public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) 
    {
        if(A.size()<=1)
        {
            return A;
        }
        int n=A.size();
        int last=n-2;
        while(last>=0)
        {
            if(A.get(last)<A.get(last+1))
            {
                break;
            }
            last--;
        }
        if(last<0)
        {
            Collections.sort(A);
            return A;
        }
        int next=n-1;
        for(int i=n-1;i>last;i--)
        {
            if(A.get(i)>A.get(last))
            {
                next=i;
                break;
            }
        }
        int temp=A.get(next);
        A.set(next,A.get(last));
        A.set(last,temp);
        last=last+1;
        int end=n-1;
        while(last<end)
        {
            temp=A.get(end);
            A.set(end,A.get(last));
            A.set(last,temp);
            last++;
            end--;
        }
        return A;
        
        
    }
}
