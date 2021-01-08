public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        if (B>A.size()) return res; //EMPTY CONDITION.
        HashMap<Integer, Integer> set = new HashMap<>();
        
        for (int j = 0; j< B; j++) set.put(A.get(j),j); //STORING INDEX WITH THEIR KEYS.
        res.add(set.size());
        
        for (int i = 1; i< A.size()-B+1; i++){
            if (set.get(A.get(i-1)) == i-1) set.remove(A.get(i-1)); //IF VALUE CHANGES, THEN IT HAS APPEARED AGAIN.
            set.put(A.get(B+i-1), B+i-1);
            res.add(set.size());
        }
        return res;
    }
}