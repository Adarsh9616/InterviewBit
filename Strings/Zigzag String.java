public class Solution {
    public String convert(String a, int b) 
    {
        if(b<2)
            return a;
        int l = a.length(), count = 0;
        boolean flag = true;
        StringBuilder[] sbs = new StringBuilder[b];
        for(int i = 0; i<b; i++)
            sbs[i] = new StringBuilder();
        int j = -1;
        for(int i = 0; i< l; i++){ 
            sbs[flag?++j:--j].append(a.charAt(i));
            if(j==b-1)
                flag=false;
            else if(j==0)
                flag=true;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: sbs) {
            res.append(sb);
        }
        return res.toString();
    }
}
