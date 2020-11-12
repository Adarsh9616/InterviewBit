public class Solution {
    public void sortColors(ArrayList<Integer> A) 
    {
        int a=0;
        int b=0;
        int c=0;
        for(int i:A)
        {
            if(i==0)
            {
                a++;
            }
            else if(i==1)
            {
                b++;
            }
            else
            {
                c++;
            }
        }
        int i=0;
        while(i<A.size())
        {
            if(a>0)
            {
                A.set(i,0);
                a--;
            }
            else if(b>0)
            {
                A.set(i,1);
                b--;
            }
            else
            {
                A.set(i,2);
                c--;
            }
            i++;
        }
        
    }
}
