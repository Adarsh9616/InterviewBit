public class Solution {
    public int findMedian(int[][] A)
    {
        int n=A.length;
        int m=A[0].length;
        int desired=(n*m+1)/2;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            min=Math.min(min,A[i][0]);
            max=Math.max(max,A[i][m-1]);
        }
        while(min<max)
        {
            int mid=(max+min)/2;
            int place=0;
            for(int i=0;i<n;i++)
            {
                int pos=Arrays.binarySearch(A[i],mid);
                if(pos<0)
                {
                    pos=Math.abs(pos+1);
                }
                else
                {
                    while(pos<m&&A[i][pos]==mid)
                    {
                        pos++;
                    }
                }
                place+=pos;
            }
            if(place<desired)
            {
                min=mid+1;
            }
            else
            {
                max=mid;
            }
        }
        return min;
    }
}
