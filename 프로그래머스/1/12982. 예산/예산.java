import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        List<Integer> dList = new ArrayList<>();
        for(int i : d){
            dList.add(i);
        }
        dList.sort(null);
        for(int i = 0; i < dList.size(); i++){
            budget -= dList.get(i);
            if(budget < 0){
                break;
            }else{
                answer++;
            }
        }
        return answer;
    }
}