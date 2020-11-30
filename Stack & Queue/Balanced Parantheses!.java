public class Solution {
    public int solve(String A) {
        int open=0;

    for(char ch:A.toCharArray()) {
        if(ch=='(') open++;
        else if(ch==')' && open >0) open--;
        else if(ch==')' && open <=0) return 0;
    }
    
    return (open==0)?1:0;
    }
}
