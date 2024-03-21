import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] comm : commands){
            List<Integer> numList = new ArrayList<>();
            for(int i = comm[0]-1; i < comm[1]; i++){
                numList.add(array[i]);
                numList.sort(null);
            }
            answer[idx] = numList.get(comm[2]-1);
            idx++;
        }
        return answer;
    }
}