public class Solution 
{
    public String solve(String A, int B) 
    {
        char[] arr = A.toCharArray();
        sol = A;
        gen(arr, 0, B);
        return sol;
    }
    
    String sol;
    public void gen(char[] arr, int ind, int B){
        if(ind >= arr.length) return;
        if(B == 0){
            String str = String.valueOf(arr);
            if(str.compareTo(sol) > 0){
                sol = str;
            }
            return;
        }
        
        for(int i=ind+1; i<arr.length; i++){
            if(arr[i] > arr[ind]){
                swap(arr, ind, i);
                String str = String.valueOf(arr);
                if(str.compareTo(sol) > 0){
                    sol = str;
                }
                gen(arr, ind+1, B-1);
                swap(arr, ind, i);
            }
        }
        gen(arr, ind+1, B);
    }
    
    public void swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
