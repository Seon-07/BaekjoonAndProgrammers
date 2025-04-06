import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[k];
        Arrays.fill(result, -1);
        for(int num : arr){
            if(!list.contains(num)) list.add(num);    
        }
        for(int i = 0; i < k && i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}