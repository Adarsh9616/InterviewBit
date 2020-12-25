public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
   public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    
    HashMap<String,ArrayList<Integer>> map= new HashMap<>();
     ArrayList<ArrayList<Integer>> ans = new  ArrayList<>();
     
   for(int i=0;i<A.size();i++)
   { 
       char ar[]= A.get(i).toCharArray();
       Arrays.sort(ar);
       String st= String.valueOf(ar);
  
      if(!map.containsKey(st))
          map.put(st, new ArrayList<Integer>()); 

     map.get(st).add(i+1);
   
   }
   for(ArrayList<Integer> s : map.values())
   {
       ans.add(s);
   }
    return ans;
}
}
