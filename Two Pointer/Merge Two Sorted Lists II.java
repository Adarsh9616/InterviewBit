public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) 
    {
        for(int i = 0; i < b.size(); i++)
        {
            int n = a.size() - 1;
            while(n >= 0 && b.get(i) < a.get(n))
            {
                n--;
            }
            a.add(n+1, b.get(i));
        }
    }
}
