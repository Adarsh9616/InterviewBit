public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B)
    {
        int first=0;
        int last=A.length-1;
        int mid=last;
        if (B >= A[0]) 
        {
            while(first<last)
            {
                
                if (A[mid]==B)
                    return mid;
                else if (A[mid]<A[0] || A[mid]>B) 
                    last=mid;
                else if(A[mid]<B )
                    first=mid+1;
                mid=(first+last)/2;
            }
            return -1;
        } 
        else 
        {
            while(first<last){
                if (A[mid]==B)
                    return mid;
                else if (A[mid]>A[0] || A[mid]<B) //Shift fisrt to mid if mid is less than number to be found  as we do in binary search or if it greater than zero'th element means it belong to lest side of minimum
                    first=mid+1;
                else if(A[mid]>B )
                    last=mid;
                mid=(first+last)/2;
            }
        return -1;
        }
    }
}
