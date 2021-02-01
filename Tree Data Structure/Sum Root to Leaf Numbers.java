public class Solution {
    long ans = 0;
    long mod = 1003;
    java.math.BigInteger m = new java.math.BigInteger("1003");
    public int sumNumbers(TreeNode A) {
        ans = 0;
        mod = 1003;
        inorder(A, "");
        return (int)(ans%mod);
    }
    void inorder(TreeNode A, String curr)
    {
        if(A!=null)
        {
            inorder(A.left, curr+A.val);
            if(A.left==null && A.right==null)
            {
                java.math.BigInteger b = new java.math.BigInteger(curr+A.val);
                b = b.mod(m);
                long cc = Long.parseLong(b.toString());
                ans = (ans+(cc%mod))%mod;
            }
            inorder(A.right, curr+A.val);
        }
    }
}