public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) 
    {
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp=a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,temp);
            }
        }
        int col=a.get(0).size();
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<col/2;j++)
            {
                int temp=a.get(i).get(j);
                a.get(i).set(j,a.get(i).get(col-j-1));
                a.get(i).set(col-j-1,temp);
            }
        }
    }
}
