public class Solution {
    public int solve(ArrayList<Integer> A) 
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:A)
        {
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        return max+min;
    }
}
