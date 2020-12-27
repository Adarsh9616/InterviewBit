public class Solution 
{
   ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
    
    HashMap<ArrayList<Integer>, Integer> hs=new HashMap<>();
    
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer>a,int b)
    {
    	int n=a.size();
    	Collections.sort(a);
    	logic(a, b, n);
    	return ans;
    	
    }
    void logic(ArrayList<Integer>a,int b,int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		for(int j=i+1;j<n;j++)
    		{
    			int s=j+1;
    			int e=n-1;
    			int x=a.get(i);
    			int y=a.get(j);
    			while(s<e)
    			{
    				if(a.get(s)+a.get(e)==b-(x+y))
    				{
    					ArrayList<Integer> temp=new ArrayList<Integer>();
    					temp.add(x);
    					temp.add(y);
    					temp.add(a.get(s));
    					temp.add(a.get(e));
    					if(!hs.containsKey(temp))
    					{
    						hs.put(temp, 1);
    						ans.add(temp);
    					}
    					s++;
    					e--;
    					
    				}
    				else if(a.get(s)+a.get(e)<b-(x+y))
    				{
    					s++;
    				}
    				else {
    					e--;
    				}
    			}
    		}
    	}
    }
}
