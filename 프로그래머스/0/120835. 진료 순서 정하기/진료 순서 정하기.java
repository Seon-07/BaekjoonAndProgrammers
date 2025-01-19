import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[emergency.length];
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], arr.length - i);
        }
        for(int i = 0; i < result.length; i++){
            int k = map.get(emergency[i]);
            result[i] = k;
        }
        return result;
    }
}