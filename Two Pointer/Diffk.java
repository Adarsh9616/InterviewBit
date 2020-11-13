public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) 
    {
        int n = A.size();
        int i=0,j=1;
        while(i<n&&j<n)
        {
            if(i==j)
                j++;
            
            if(i<n&&j<n&&A.get(j)-A.get(i) == B)
                return 1;
            else if(i<n&&j<n&&A.get(j)-A.get(i)< B)
                j++;
            else if(i<n&&j<n&&A.get(j)-A.get(i) >B)
                i++;
            
        }
        return 0;
    }
}
