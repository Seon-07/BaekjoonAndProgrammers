class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];
        int index = 0;    
        for(int num : num_list){
            result[index / n][index % n] = num;
            index++;
        }
        return result;
    }
}