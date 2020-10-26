public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int findCount(final List<Integer> A, int B) 
    {
        int f=getFirst(A,B);
        int l=getLast(A,B);
        if(f==-1&&l==-1)
        {
            return 0;
        }
        return l-f+1;
    }
    public int getFirst(List<Integer>A,int B)
    {
        int l=0;
        int u=A.size()-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if((mid==0||A.get(mid-1)<B)&&A.get(mid)==B)
            {
                return mid;
            }
            else if(A.get(mid)>=B)
            {
                u=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
    public int getLast(List<Integer>A,int B)
    {
        int l=0;
        int u=A.size()-1;
        while(l<=u)
        {
            int mid=(l+u)/2;
            if((mid==A.size()-1||A.get(mid+1)>B)&&A.get(mid)==B)
            {
                return mid;
            }
            else if(A.get(mid)>B)
            {
                u=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return -1;
    }
}
