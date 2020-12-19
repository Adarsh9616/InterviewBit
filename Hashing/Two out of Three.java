public class Solution {
    public HashSet<Integer> update(ArrayList<Integer> a, ArrayList<Integer> b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : a) {
            set.add(i);
        }
        for(int i : b) {
            set.add(i);
        }
        return set;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        HashSet<Integer> ab = update(A, B);
        HashSet<Integer> ac = update(A, C);
        HashSet<Integer> bc = update(B, C);
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : A) {
            if(bc.contains(i) && !set.contains(i)) {
                res.add(i);
                set.add(i);
            }
        }
        for(int i : B) {
            if(ac.contains(i) && !set.contains(i)) {
                res.add(i);
                set.add(i);
            }
        }
        for(int i : C) {
            if(ab.contains(i) && !set.contains(i)) {
                res.add(i);
                set.add(i);
            }
        }
        Collections.sort(res);
        return res;
    }
}