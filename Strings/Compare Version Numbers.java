import java.math.*;
public class Solution {
public int compareVersion(String A, String B) {
List<String> li1=new ArrayList(Arrays.asList(A.split("\\.")));
List<String> li2=new ArrayList(Arrays.asList(B.split("\\.")));

   while(li1.size()<li2.size())
    li1.add("0");
   while(li1.size()>li2.size())
    li2.add("0");  
    int i=0;
    while(i<li1.size() && i<li2.size())
    {
        
        BigInteger a=new BigInteger(li1.get(i));
        BigInteger b=new BigInteger(li2.get(i));
        int x=a.compareTo(b);
        if(x<0)
            return -1;
        else if(x>0)
            return 1;
        else i++;
            
    }
    return 0;
}
}