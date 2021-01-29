public class Solution {
ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        
        ArrayList<Integer> temp = new ArrayList<Integer>(); 
        
        if(A == null) return output; 

        helper(A,0,B,temp); 
        return output; 
    }
    
    public void helper(TreeNode A, int sum, int B, ArrayList<Integer> temp){
        
        sum += A.val; 
        temp.add(A.val); 
        
        if(A.left == null && A.right == null){
            if(sum == B) output.add(temp);
        }
        
     if(A.left != null) helper(A.left, sum, B, new ArrayList<Integer>(temp));
     if(A.right != null) helper(A.right, sum, B, new ArrayList<Integer>(temp));

        }
}