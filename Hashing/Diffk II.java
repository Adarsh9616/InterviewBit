public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B)
    {
        for(int i=0;i<A.size();i++){
        if(A.contains(A.get(i)-B)){
            int index=A.indexOf(A.get(i)-B);
            if(index!=i){
                return 1;
            }
        }
        
    }
    return 0;
    }
}
