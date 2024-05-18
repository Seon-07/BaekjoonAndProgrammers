class Solution {
    public int[][] solution(int n) {
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = i == j ? 1 : 0 ;
            }
        }
        return a;
    }
}