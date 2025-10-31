class Solution {
    public int[][] solution(int[][] arr) {
        int k = arr.length;
        int q = arr[0].length;
        int size = Math.max(k, q);
        
        int[][] result = new int[size][size];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < q; j++) {
                result[i][j] = arr[i][j];
            }
        }
        return result;
    }
}