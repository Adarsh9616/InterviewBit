public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) 
    {
        List<String> ar= new ArrayList<>();
        for(int i:A)
        {
            ar.add(String.valueOf(i));
        }
        Collections.sort(ar,(a,b)->{
            String x=a+b;
            String y=b+a;
            return y.compareTo(x);
        });
        StringBuilder s=new StringBuilder("");
        for(String i:ar)
        {
            s.append(i);
        }
        return s.charAt(0)=='0'?"0":s.toString();
        
    }
}
