public class Solution 
{
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) 
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        recursiveSubsetsWithDup(A, result, new ArrayList(), 0);
        return result;
    }
    private void recursiveSubsetsWithDup(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int index) 
    {
        result.add(current);
        for (int i=index; i<A.size(); i++)
        {
            ArrayList<Integer> tmp = new ArrayList<Integer>(current);
            Integer currentItem = new Integer(A.get(i));
            tmp.add(currentItem);
            recursiveSubsetsWithDup(A, result, new ArrayList(tmp), i+1);
            while ( ( (i + 1) < A.size()) && A.get(i+1).equals(currentItem))
            {
                i++;
            }
            tmp.remove(tmp.size() - 1);
        }
    }
}