public class Solution {
    public int solve(ArrayList<Integer> A, int B) 
    {
        int pivot=findBiotonic(A,1,A.size()-2,B);
        if(pivot<0)
        {
            return -1;
        }
        int k=searchI(A,0,pivot,B);
        if(k>=0)
        {
            return k;
        }
        return searchD(A,pivot,A.size()-1,B);
    }
    public int searchI(ArrayList<Integer>A,int l,int u,int B)
    {
        if(l>u)
        {
            return -1;
        }
        
        int mid=(l+u)/2;
        if(A.get(mid)==B)
        {
            return mid;
        }
        if(A.get(mid)>B)
        {
            return searchI(A,l,mid-1,B);
        }
        return searchI(A,mid+1,u,B);
    }
    public int searchD(ArrayList<Integer> A,int l,int u,int B)
    {
        if(l>u)
        {
            return -1;
        }
        
        int mid=(l+u)/2;
        if(A.get(mid)==B)
        {
            return mid;
        }
        if(A.get(mid)<B)
        {
            return searchD(A,l,mid-1,B);
        }
        return searchD(A,mid+1,u,B);
    }
    public int findBiotonic(ArrayList<Integer>A, int l,int u,int B)
    {
        if(l<=u)
        {
            int mid=(l+u)/2;
            if(A.get(mid)>A.get(mid-1)&&A.get(mid)>A.get(mid+1))
            {
                return mid;
            }
            if(A.get(mid)<A.get(mid+1))
            {
                return findBiotonic(A,mid+1,u,B);
            }
            else 
            {
                return findBiotonic(A,l,mid-1,B);
            }
            
        }
        return -1;
    }
}
