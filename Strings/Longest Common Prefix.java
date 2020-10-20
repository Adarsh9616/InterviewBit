public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) 
    {
        if(A.size()==0)
        {
            return "";
        }
        StringBuilder st=new StringBuilder("");
        String k=A.get(0);
        String t=A.get(0);
        for(String s:A)
        {
            if(s.compareTo(k)<0)
            {
                k=s;
            }
            if(s.compareTo(t)>0)
            {
                t=s;
            }
        }
        for(int i=0;i<Math.min(k.length(),t.length());i++)
        {
            if(t.charAt(i)==k.charAt(i))
            {
                st.append(t.charAt(i));
            }
        }
        return st.toString();
    }
}
