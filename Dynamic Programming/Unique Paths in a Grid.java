public class Solution {
    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        int rowLen = A.size();
        int colLen = A.get(0).size();
        int[][] t = new int[rowLen][colLen];
        for(int row = 0; row < rowLen; row++) {
            for(int col = 0; col < colLen; col++) {
                if(A.get(row).get(col) == 1) {
                    t[row][col] = 0;
                } else if(row == 0 && col == 0) {
                    t[row][col] = 1;
                } else {
                    int priorRow = row == 0? 0: row - 1;
                    int priorCol = col == 0? 0: col - 1;
                    t[row][col] = t[priorRow][col] + t[row][priorCol];
                }
            }
        }
        return t[rowLen - 1][colLen - 1];
    }
}