import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] arrD) {
        List<Integer> arrList = new ArrayList<>();
        for(int k : arr){
            arrList.add(k);
        }
        for(int k : arrD){
            if(arrList.contains(k)){
                arrList.remove(Integer.valueOf(k));
            }
        }
        int[] answer = new int[arrList.size()];
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}