public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
ArrayList lst = new ArrayList();

    for(int i=0;i<A.size();i++){
        if(map.containsKey(B-A.get(i))){
            lst.add(map.get(B-A.get(i))+1);
            lst.add(i+1);
            break;
        }
        else if(!(map.containsKey(A.get(i)))){
            map.put(A.get(i),i);
        }
    }
    return lst;
    }
}
