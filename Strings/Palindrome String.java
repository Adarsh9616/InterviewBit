public class Solution {
    public int isPalindrome(String A) 
    {
        A=A.toLowerCase();
        StringBuilder temp=new StringBuilder("");
        for(char c:A.toCharArray())
        {
            if((c >= 'a' && c <= 'z')||(c >= '0' && c <= '9'))
            {
                temp.append(c);
            }
        }
        String t=temp.toString();
        StringBuilder st=new StringBuilder(temp);
        st.reverse();
        String B=st.toString();
        return t.equals(B)?1:0;
    }
}
