public class Solution {
    
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    
    public void findPermutations(ArrayList<Integer> soFar, ArrayList<Integer> rest)
    {
        if(rest.size() == 0){
            result.add(new ArrayList<Integer>(soFar));
        }else{
            for(int i=0; i<rest.size(); i++){
                int current = rest.remove(i);
                soFar.add(current);
                findPermutations(soFar, rest);
                rest.add(i, current);
                soFar.remove(soFar.size()-1);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        findPermutations(new ArrayList<Integer>(), A);
        return result;
    }
}