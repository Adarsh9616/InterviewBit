public class Solution {
    public int solve(ArrayList<Integer> A, int B) 
    {
        int sum=0,ans,n=A.size();
        for(int i=n-1;i>=n-B;i--)sum+=A.get(i);
        ans=sum;
        for(int i=0;i<B;i++){
            sum+=A.get(i)-A.get(n-B+i);
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
