class Solution {
    Stack<Integer> s=new Stack<Integer>();
    int m=-1;
    public void push(int x) 
    {
        if(s.isEmpty())
        {
            s.push(x);
            m = x;
        }
        else
        {
            if(x>=m)
            {
                s.push(x);
            }
            else
            {
                s.push(2*x-m);
                m = x;
            }
        }
    }

    public void pop() 
    {
        if(!s.isEmpty())
        {
            if(s.peek()>m)
            {
                s.pop();
                if(s.isEmpty())
                    m=-1;
            }
            else
            {
                m = 2*m-s.peek();
                s.pop();
                if(s.isEmpty())
                    m=-1;
            }
        }
    }

    public int top() 
    {
        if(s.isEmpty())
        {
            return -1;
        }
        else
        {
            if(s.peek()>m)
                return s.peek();
            else
                return m;
        }
    }

    public int getMin() 
    {
        return m;
    }
}
