public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) 
    {
        int i=0;
        int j=A.get(0).size()-1;
        while(i<A.size()&&j>=0)
        {
            int k=A.get(i).get(j);
            if(k==B)
            {
                return 1;
            }
            else if(B>k)
            {
                i++;
            }
            else if(B<k)
            {
                j--;
            }
        }
        return 0;
    }
}
