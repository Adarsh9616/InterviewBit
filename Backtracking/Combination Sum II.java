public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    ArrayList<Integer> al;
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        ans = new ArrayList<>();
        al = new ArrayList<>();
        rec(a,b,0,0);
        Set<ArrayList<Integer>> set = new LinkedHashSet<>();
        set.addAll(ans);
        ans.clear();
        ans.addAll(set);
        return ans;
    }
    
    void rec(ArrayList<Integer> a,int b, int sum, int in){
        if(sum > b){
            return ;
        }
        if(sum == b){
            ArrayList<Integer> tmp = new ArrayList<>(al);
            ans.add(tmp);
        }
        for(int i=in;i<a.size();i++){
            al.add(a.get(i));
            rec(a,b,sum+a.get(i),i+1);
            al.remove(al.size()-1);
        }
    }
}