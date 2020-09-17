public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) 
    {
        int ar[]=new int[A.size()+1];
        for(int i:A)
        {
            ar[i]++;
            if(ar[i]>1)
            {
                return i;
            }
        }
        return -1;
    }
}
