public class Solution {
    public int uniquePaths(int A, int B) {
        return  ncr(A+B-2, Math.min (A-1, B-1));
    }

    private int ncr(int n, int r) {
        long res = 1;
        int N = n;
        int R = Math.min (r, n-r);
        for ( int i=1; i<=R; i++){
            res*=n;
            n--;
        }
        //System.out.println(res);
        long res1 = 1;
        for ( int i=1; i<=r; i++){
            res1*=i;
        }
        //System.out.println(res1);
        return (int) (res/res1);
    }
}
