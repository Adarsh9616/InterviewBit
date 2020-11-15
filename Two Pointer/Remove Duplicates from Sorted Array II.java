public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) 
    {
        int i=0;
        int num=0;
        while(i<a.size())
        {
            if(a.get(i).equals(a.get(num)) 
            && i-num>=1 && ((i<a.size()-1 
            && !a.get(i).equals(a.get(i+1)))
            || i==a.size()-1))
            {
                a.set(++num,a.get(i));
            }
            else if(!a.get(i).equals(a.get(num)))
            {
                a.set(++num,a.get(i));
            }
            i++;
        }
        return num+1;
    }
}
