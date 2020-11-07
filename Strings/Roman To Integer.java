public class Solution {
    public int romanToInt(String A) 
    {
        
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        if(A.length()==1)
        {
            return map.get(A.charAt(0));
        }
        int ans=map.get(A.charAt(A.length()-1));
        for(int i=A.length()-2;i>=0;i--)
        {
            char c1=A.charAt(i);
            char c2=A.charAt(i+1);
            if(map.get(c1)<map.get(c2))
            {
                ans-=map.get(c1);
            }
            else
            {
                ans+=map.get(c1);
            }
        }
        return ans;
    }
}
