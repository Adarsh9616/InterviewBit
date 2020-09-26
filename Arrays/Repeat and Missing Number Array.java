public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) 
    {
        long n=A.size();
        long sum=(n*(n+1))/(long)2;
        long sumSq=(n*(n+1)*(2*n+1))/(long)6;
        for(int i=0;i<n;i++)
        {
            long a=A.get(i);
            sum-=a;
            sumSq-=a*a;
        }
        long missing=(sum+sumSq/sum)/(long)2;
        long repeat=missing-sum;
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add((int)repeat);
        ar.add((int)missing);
        return ar;
    }
}
