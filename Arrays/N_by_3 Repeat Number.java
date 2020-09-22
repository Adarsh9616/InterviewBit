public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a)
    {
        int count1=0;
        int count2=0;
        Integer candidate1=null;
        Integer candidate2=null;
        for(int i:a)
        {
            if(candidate1!=null&&candidate1==i)
            {
                count1++;
            }
            else if(candidate2!=null&&candidate2==i)
            {
                count2++;
            }
            else if(count1==0)
            {
                candidate1=i;
                count1++;
            }
            else if(count2==0)
            {
                candidate2=i;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i:a)
        {
            if(candidate1!=null&&candidate1==i)
            {
                count1++;
            }
            if(candidate2!=null&&candidate2==i)
            {
                count2++;
            }
        }
        int n=a.size();
        if(count1>n/3)return candidate1;
        if(count2>n/3)return candidate2;
        
        return -1;
    }
}
