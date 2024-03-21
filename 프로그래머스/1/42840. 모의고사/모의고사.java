import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int aScore = 0;
        int bScore = 0;
        int cScore = 0;
        
        for(int i = 0; i < answers.length; i++){
            aScore = (a[i%5] == answers[i]) ? aScore+1 : aScore;
            bScore = (b[i%8] == answers[i]) ? bScore+1 : bScore;
            cScore = (c[i%10] == answers[i]) ? cScore+1 : cScore;
        }
        int[] scores = {aScore, bScore, cScore};
        int max = Math.max(aScore,Math.max(bScore, cScore));
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            if(scores[i] == max){
                nums.add(i+1);
            }
        }
        int[] answer = nums.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}