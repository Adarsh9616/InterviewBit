public class Solution {
    public int evalRPN(String[] A) 
    {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < A.length; i++)
        {
            if (A[i].equals("+"))
            {
                int a = s.pop();
                int b = s.pop();
                s.push(a+b);
            }
            else if (A[i].equals("*"))
            {
                int a = s.pop();
                int b = s.pop();
                s.push(a*b);
            }
            else if (A[i].equals("/"))
            {
                int a = s.pop();
                int b = s.pop();
                s.push(b/a);
            }
            else if (A[i].equals("-"))
            {
                int a = s.pop();
                int b = s.pop();
                s.push(b-a);
            }
            else
                s.push(Integer.parseInt(A[i]));
        }
        return s.pop();
    }
}
