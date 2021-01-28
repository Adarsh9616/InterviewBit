int Solution::solve(vector<int> &A, vector<int> &B) {

int maxXor=0,mask=0;
unordered_set<int> s1,s2;
for(int i=31;i>=0;i--)
{
    int newMax=(maxXor|(1<<i));
    mask|=(1<<i);
    for(int j=0;j<A.size();j++)
    {
        s1.insert(A[j]&mask);
    }
    for(int j=0;j<B.size();j++)
    {
        s2.insert(B[j]&mask);
    }
    for(auto prefix: s1)
    {
        if(s2.count(prefix^newMax))
            {
                maxXor=newMax;
                break;
            }
    }
    s1.clear();
    s2.clear();
}
return maxXor;
}