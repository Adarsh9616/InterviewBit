public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) 
	{
	    int l=0;int u=a.size()-1;
	    while(l<=u)
	    {
	        int mid=(l+u)/2;
	        int k=a.get(mid);
	        if(k==b)
	        {
	            return mid;
	        }
	        else if(k<b)
	        {
	            l=mid+1;
	        }
	        else
	        {
	            u=mid-1;
	        }
	    }
	    return l;
	}
}
