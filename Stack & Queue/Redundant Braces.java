public class Solution {
    public int braces(String A) 
    {
        Stack<String> S = new Stack<>();
    String operators = "+-*/";
    for(int i=0; i< A.length(); i++){
        if(A.charAt(i) != ')'){
            S.push(Character.toString(A.charAt(i)));
        }
        else{
            int operand_count = 0;
            int operator_count = 0;
            while(!S.peek().equals("(")){
                String op = S.pop();
                if(operators.indexOf(op) != -1){
                    operator_count += 1;
                }
                else{
                    operand_count += 1;
                }
            }
            if(operand_count == 0 || operator_count == 0){
                return 1;
            }
            else{
                S.pop();
            }
        }
    }
    return 0;
    }
}
