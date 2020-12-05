public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] slidingMaximum(final int[] A, int B) 
    {
        int[] result = new int[A.length - B + 1];
    Integer max = Integer.MIN_VALUE;
    
    for(int i = 0; i < A.length; i++){
        max = Math.max(max, A[i]);
        
        if(i < B - 1){
            continue;
        }
        result[i - B + 1] =  max;
        if(max != A[i - B + 1]){
            continue;
        }
        max = Integer.MIN_VALUE;
        for(int j = (i - B + 2); j <= i; j++){
            max = Math.max(max, A[j]);  
        }
    }
    return result;
    }
}
