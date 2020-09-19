public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) 
    {
        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            int pos = num - 1;
            
            if (pos >= 0 && pos < A.size() && A.get(pos) != num) {
                A.set(i, A.get(pos));
                A.set(pos, num);
                i--;
            }
        }
        
        for (int i = 0; i < A.size(); i++)
            if (A.get(i) != i + 1)
                return i + 1;
        
        return A.size() + 1;
    }
}
