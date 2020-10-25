public class Solution {
    public int solve(String A) 
    {
        int i=0,j=A.length()-1;
        char[] arr=A.toCharArray();
        boolean flag=false;
        while(i<j){
            if(arr[i]!=arr[j]){
                if(flag)    return 0;
                flag=true;
                i++;
            }else{
                i++;
                j--;
            }
        }
        return 1;
    }
}
