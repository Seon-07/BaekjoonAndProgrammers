import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        List<Double> avg = new ArrayList<>();
        int[] result = new int[score.length];
        for(int[] stud : score){
            int sum = stud[0]+stud[1];
            avg.add(sum/2.0);
        }
        List<Double> rnk = new ArrayList<>(avg);
        rnk.sort(Collections.reverseOrder());
        for(int i = 0; i < score.length; i++){
            result[i] = rnk.indexOf(avg.get(i)) + 1;
        }
        return result;
    }
}