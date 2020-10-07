public class Solution {
    public String solve(String A) 
    {
        char[] a = A.toCharArray();
        int i=a.length-2;
        while(i>=0 && a[i]>=a[i+1]) i--;
        if(i==-1) return "-1";
        int j=a.length-1;
        while(j>=0 && a[j]<=a[i]) j--;
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        int start = i+1;
        int end = a.length-1;
        while(start<end){
            temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
        return new String(a);
    }

}
