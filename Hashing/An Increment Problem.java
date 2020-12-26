public class Solution {
    public int[] solve(int[] arr) 
    {
        int n = arr.length;
        if(n == 1)  return arr;
        int p = 0, q = 1;
        
        while(q < n){
            
            p = 0;
            int val = arr[q];
            
            while(p < q){
                
                if(arr[p] != val){
                    p++;
                }
                else{
                    arr[p] = arr[p] + 1;
                    break;
                }
            }
            
            q++;
        }
        
        return arr;
    }
}
