public class Solution {
    public int solve(ArrayList<String> A) 
    {
        int count = 0;
    	if(A.size()<3) {
    		return 0;
    	}
    	ArrayList<Double> res = new ArrayList<>();
    	Collections.sort(A);
    	int j = 0; 
    	
    	for(int i = A.size()-1; j<i-1;) {
    		double sum = 0;
    			
    			sum = sum+ Double.parseDouble(A.get(j))+Double.parseDouble(A.get(j+1))+Double.parseDouble(A.get(i));
    			
    			if(sum>=2) {
    				i--;
    			}else if(sum<=1) {
    				j++;
    			}else return 1;
    	}
    	return 0;
    }
}
