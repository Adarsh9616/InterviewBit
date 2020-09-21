public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) 
    {
        int l=A.size();
        int i=0;
        long max=-1;
        long sum=0;
        ArrayList<Integer> temp=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<l)
        {
            temp=new ArrayList<>();
            while(i<l&&A.get(i)<0)
            {
                i++;
            }
            while(i<l&&A.get(i)>=0)
            {
                sum=sum+A.get(i);
                temp.add(A.get(i));
                if(max<sum)
                {
                    max=sum;
                    ans=new ArrayList<>(temp);
                }
                else if(max==sum)
                {
                    max=sum;
                    if(temp.size()>ans.size())
                    {
                        ans=new ArrayList<>(temp);
                    }
                }
                i++;
            }
            sum=0;
        }
        return ans;
    }
}
