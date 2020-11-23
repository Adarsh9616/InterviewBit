public class Solution {
    public String addBinary(String a, String b) 
    {
        int temp = 0;
    String result = "";
    int i = a.length()-1;
    int j = b.length()-1;
    int difference=Math.abs(i-j);
    if(i>j){
        for(int k=0;k<difference;k++)
            b="0"+b;
    }else if(j>i){
        for(int k=0;k<difference;k++)
            a="0"+a;
    }
     i=a.length()-1;
     j=b.length()-1;
    while (i >= 0 || j >= 0) {
        if (a.charAt(i) == '1' && b.charAt(j) =='1') {
            result = (0 + temp) + result;
            temp = 1;
        } else {
            if (temp == 1 && ((Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j))) == 1)) {
                result = "0" + result;
                temp = 1;
            } else {
                result = ((Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(j))) + temp) + result;
                temp=0;
            }
        }
        
        i--;
        j--;
    }
    if(temp==1)
        result=temp+result;
    return result;
    }
}
