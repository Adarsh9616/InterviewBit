public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) 
    {
        int m=a.size();
        int n=a.get(0).size();
        boolean col=false;
        for(int i=0;i<m;i++)
        {
            if(a.get(i).get(0)==0)
            {
                col=true;
            }
            for(int j=1;j<n;j++)
            {
                
                if(a.get(i).get(j)==0)
                {
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(a.get(i).get(0)==0||a.get(0).get(j)==0)
                {
                    a.get(i).set(j,0);
                }
            }
        }
        if(a.get(0).get(0)==0)
        {
            for(int j=0;j<n;j++)
            {
                a.get(0).set(j,0);
            }
        }
        if(col)
        {
            for(int i=0;i<m;i++)
            {
                a.get(i).set(0,0);
            }
        }
    }
}
