public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) 
    {
        
        Collections.reverse(A);
        ArrayList<Integer> ans=new ArrayList<>();
        int carry=1;
        for(int i:A)
        {
            int temp=carry+i;
            carry=temp/10;
            ans.add(temp%10);
        }
        if(carry>0)
        {
            ans.add(carry);
        }
        Collections.reverse(ans);
        while(ans.get(0)==0)
        {
            ans.remove(0);
        }
        return ans;
    }
}
