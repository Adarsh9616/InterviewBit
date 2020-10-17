public class Solution {
    public String convertToTitle(int a)
    {
          String s="";
	    while(a!=0){
	        a=a-1;
	        char c=(char)(a%26+65);
	        s=c+s;
	        a/=26;
	    }
	    return s;
    }
}
