public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) 
    {
        int r2=A-1;
        int c2=A-1;
        int r1=0;
        int c1=0;
        int dir=0;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Integer ar[][]=new Integer[A][A];
        int value=1;
        while(r1<=r2&&c1<=c2)
        {
            if(dir==0)
            {
                for(int i=c1;i<=c2;i++)
                {
                    ar[r1][i]=value++;
                }
                r1++;
                dir+=1;
            }
            else if(dir==1)
            {
                for(int i=r1;i<=r2;i++)
                {
                    ar[i][c2]=value++;
                }
                dir+=1;
                c2--;
            }
            else if(dir==2)
            {
                for(int i=c2;i>=c1;i--)
                {
                    ar[r2][i]=value++;
                }
                dir+=1;
                r2--;
            }
            else if(dir==3)
            {
                for(int i=r2;i>=r1;i--)
                {
                    ar[i][c1]=value++;
                }
                dir+=1;
                c1++;
            }
            dir=dir%4;
        }
        for(Integer i[]:ar)
        {
            ArrayList<Integer> temp=new ArrayList<>(Arrays.asList(i));
            ans.add(temp);
        }
        return ans;
    }
}
