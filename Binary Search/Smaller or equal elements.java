public class Solution {
    public int solve(int[] arr, int key) 
    {
        int n = arr.length;
    int start = 0, end = (n-1), ans = -1;
    
    while(start <= end){
        
        int mid = start + (end - start)/2;
        
        if(arr[mid] <= key){
            
            start = mid + 1;
            ans = mid;
        }
        else{
            end = mid -1;
        }
    }
    
    return ans + 1;
    }
}
