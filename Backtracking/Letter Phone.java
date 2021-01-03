public class Solution {
    void findAllComb(String str, ArrayList<String> res, int cur, StringBuilder temp, Map<Character,String> mp) {
        if(cur == str.length()) {
            res.add(new StringBuilder(temp).toString());
            return;
        }
        String curStr = mp.get(str.charAt(cur));
        for(int i =0;i<curStr.length();i++) {
            temp.append(curStr.charAt(i));
            findAllComb(str,res,cur+1, temp, mp);
            temp.delete(temp.length()-1,temp.length());;
        }
    }
    public ArrayList<String> letterCombinations(String str) {
        Map<Character, String> mp = new HashMap<>();
        mp.put('0',"0");
        mp.put('1',"1");
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        ArrayList<String> res = new ArrayList<>();
        findAllComb(str,res,0, new StringBuilder(), mp);
        return res;
    }
}