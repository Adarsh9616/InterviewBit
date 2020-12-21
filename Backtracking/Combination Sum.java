public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b)
    {
    ArrayList<ArrayList<Integer>> ans =new ArrayList<ArrayList<Integer>>();
    if (a==null || a.size()==0) return ans;
    Collections.sort(a);
    generate(0,a,new ArrayList<Integer>(),ans,b);
    
    return ans;
}

public void generate(int index,ArrayList<Integer> a,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans,int target){
    if (target<=0){
        if (target==0){
            ans.add(new ArrayList<>(curr));
        }
        return;
    }
    
    for (int i=index;i<a.size();i++){
        if (i==index || a.get(i)!=a.get(i-1)){
        curr.add(a.get(i));
        generate(i,a,curr,ans,target-a.get(i));
        curr.remove(curr.size()-1);}
    }
}
}
