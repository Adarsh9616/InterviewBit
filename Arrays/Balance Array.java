public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        long even=0;
        long odd=0;
        long leftOdd[]=new long[A.size()];
        long leftEven[]=new long[A.size()];
        int count=0;
        int n=A.size();
        long rightOdd[]=new long[A.size()];
        long rightEven[]=new long[A.size()];
        
        for(int i=0;i<A.size();i++)
        {
            leftOdd[i]=odd;
            leftEven[i]=even;
            if((i&1)==0)
            {
                odd+=A.get(i);
            }
            else
            {
                even+=A.get(i);
            }
        }
        odd = 0;
        even = 0;
        // pre compute the right side odd and even elements sum;
        for(int i=n-1;i>=0;i--)
        {
            rightOdd[i] = odd;
            rightEven[i] = even;
            if((i&1)==0)
            {
                odd+=A.get(i);
            }
            else
            {
                even+=A.get(i);
            }
        }
        
        //find the number of times this condition evaluates to true. Thats our answer.
        for(int i=0;i<n;i++)
        {
            if(leftOdd[i]+rightEven[i]==leftEven[i]+rightOdd[i]){
                count++;
            }
        }
        return count;
    }
}
