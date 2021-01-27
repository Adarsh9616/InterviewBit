public class Solution {

public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
    ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
    Queue<TreeNode> q=new LinkedList<>();
    q.add(A);
    int d=0;
    while(!q.isEmpty()){
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int n=q.size();
        for (int i=0;i<n;i++){
            TreeNode x=q.poll();
            temp.add(x.val);
            if (x.left!=null) q.add(x.left);
            if (x.right!=null) q.add(x.right);
        }
        if (d==1) Collections.reverse(temp);
        d=(d+1)%2;
        ans.add(temp);
    }
    return ans;
}
}