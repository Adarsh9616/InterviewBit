public class Solution {
    public ArrayList<String> fizzBuzz(int A) 
    {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=A;i++)
        {
            if(i%15==0)
            {
                ans.add("FizzBuzz");
            }
            else if(i%5==0)
            {
                ans.add("Buzz");
            }
            else if(i%3==0)
            {
                ans.add("Fizz");
            }
            else
            {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
