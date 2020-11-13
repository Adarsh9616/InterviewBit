public class Solution {
    public int removeDuplicates(ArrayList<Integer> A) 
    {
        int i=0;int j=0;
        while(i<A.size())
        {
            A.set(j,A.get(i));
            while(i<A.size()&&A.get(j).equals(A.get(i)))
                i++;
            j++;
        }
        return j;
    }
}
