public class Solution {
    public ArrayList<Integer> flip(String A) 
    {
        int ar[]=new int[A.length()];
        int k=0;
        for(char i:A.toCharArray())
        {
            if(i=='0')
            {
                ar[k]=1;
            }
            else
            {
                ar[k]=-1;
            }
            k++;
        }
        int min=0;int start=0;int Smin=0;
        int St=-1;int Et=-1;
        k=0;
        for(int i:ar)
        {
            if(Smin+i<0)
            {
                Smin=0;
                start=k+1;
            }
            else
            {
                Smin=Smin+i;
            }
            
            if(Smin>min)
            {
                min=Smin;
                St=start;
                Et=k;
            }
            k++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        if(St==-1)
        {
            return ans;
        }
        ans.add(St+1);
        ans.add(Et+1);
        return ans;
    }
}
