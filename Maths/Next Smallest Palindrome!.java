public class Solution {
    public String solve(String s) 
    {
        char A[]=s.toCharArray();
        int l = 0, r = A.length - 1;
        while (l <= r) {
            if (A[l] != A[r]) {
                A[r] = A[l];
            }
            l++; r--;
        }
    
        if (String.valueOf(A).compareTo(s)>0) return String.valueOf(A);
    
        l--; r++;
    
        while (is9(A, l)) {
            A[l] = '0';
            A[r] = '0';
            l--; r++;
        }
        
        if (l >= 0) { // if L is >= 0 then R is < str.size() always
            A[l] += 1;
            A[r] = A[l];
        } else { // we enter here if our number is full of 9s. e.g. "99999"
            A[0] = '1';
            return String.valueOf(A)+'1';
        }
        
        return String.valueOf(A);
    }
    boolean is9(char str[],int pos)
    {
        if (pos < 0 || pos >= str.length || str[pos] != '9') return false;
        else return true;
    }
}
