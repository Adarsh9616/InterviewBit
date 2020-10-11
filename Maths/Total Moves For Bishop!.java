public class Solution {
    public int solve(int a, int b) 
    {
        int i = Math.min(a - 1, b - 1);
        int j = Math.min(8 - a, 8 - b);
        int k = Math.min(8 - a, b - 1);
        int l = Math.min(a - 1, 8 - b);
        return i + j + k + l;
    }
}
