import java.util.*;
class Solution {
    public int[] solution(String str) {
        List<Integer> k = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) > 47 && str.charAt(i) < 58){
               k.add(Integer.parseInt(str.charAt(i)+""));
           } 
        }
        k.sort(null);
        int[] answer = new int[k.size()];
        for(int i = 0; i < k.size(); i++){
            answer[i] = k.get(i);
        }
        return answer;
    }
}