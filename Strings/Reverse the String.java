public class Solution {
    public String solve(String A) 
    {
        String A1=A.trim();

        String[] s=A1.split("\\s");
        
        String r="";
        for(int i=s.length-1;i>=0;i--)
        {
         
            r=r+" "+s[i];
        }
        
        return r.trim().replaceAll("( +)", " ");
    }
}
