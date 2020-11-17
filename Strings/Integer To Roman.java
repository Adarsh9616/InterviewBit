public class Solution {
    public String intToRoman(int A) 
    {
        int ints[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roms[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String res = "";
        
            while(A>0)
            {
                int i= ints.length-1;         
                for(;i>=0;i--)
                {
                    if(ints[i]<=A)
                    {
                        A-=ints[i];
                        break;
                    }
                }
                res = res + roms[i];            
            }
            return res;
    }
}
