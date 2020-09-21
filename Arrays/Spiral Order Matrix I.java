public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) 
    {
        int r2=A.size()-1;
        int c2=A.get(0).size()-1;
        int r1=0;
        int c1=0;
        int dir=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(r1<=r2&&c1<=c2)
        {
            if(dir==0)
            {
                for(int i=c1;i<=c2;i++)
                {
                    ans.add(A.get(r1).get(i));
                }
                r1++;
                dir+=1;
            }
            else if(dir==1)
            {
                for(int i=r1;i<=r2;i++)
                {
                    ans.add(A.get(i).get(c2));
                }
                dir+=1;
                c2--;
            }
            else if(dir==2)
            {
                for(int i=c2;i>=c1;i--)
                {
                    ans.add(A.get(r2).get(i));
                }
                dir+=1;
                r2--;
            }
            else if(dir==3)
            {
                for(int i=r2;i>=r1;i--)
                {
                    ans.add(A.get(i).get(c1));
                }
                dir+=1;
                c1++;
            }
            dir=dir%4;
        }
        return ans;
    }
}
