public class Solution {
public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
    if(A==null)
        return null;
    int n = A.size();
    Collections.sort(A);
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    result.add(new ArrayList<Integer>());
    for(int i=0;i<A.size();i++)
        subsets(A, result, new ArrayList(),i);
    return result;
}
public  void subsets(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int i){
    temp.add(A.get(i));
    result.add(temp);
    if(i==A.size())
        return;
    for(int j=i+1;j<A.size();j++){
        subsets(A, result, new ArrayList<Integer>(temp), j);
    }
}
}