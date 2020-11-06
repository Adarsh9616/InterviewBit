public class Solution {
    public String countAndSay(int A) 
    {
        String result = Integer.toString(1);
        if(A < 2) return result;
        int i = 1;
        while(i < A) {
            int count = 0;
            String temp = "";
            for(int j = 0; j < result.length(); j++) {
                String cur = Character.toString(result.charAt(j));
                String next = (j < result.length() - 1)? Character.toString(result.charAt(j + 1)): "";
                count++;
                if(!cur.equals(next)) {
                    temp += Integer.toString(count) + cur;
                    count = 0;
                }
            }
            result = temp;
            i++;
        }
        return result;
    }
}
