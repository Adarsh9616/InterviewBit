public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) 
    {
        Collections.sort(A);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;int j=i+1;
        while(j<A.size())
        {
            ans.add(A.get(j));
            ans.add(A.get(i));
            i+=2;
            j+=2;
        }
        if(A.size()%2!=0)
        {
            ans.add(A.get(A.size()-1));
        }
        return ans;
    }
}
