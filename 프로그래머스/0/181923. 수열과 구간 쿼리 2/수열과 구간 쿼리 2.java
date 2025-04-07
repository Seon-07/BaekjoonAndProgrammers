import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int ordr = i;
            int num = Arrays.stream(arr, queries[i][0], queries[i][1] + 1)
                   .filter(n -> n > queries[ordr][2])
                   .min()
                   .orElse(-1);
            result[i] = num;
        }
        return result;
    }
}