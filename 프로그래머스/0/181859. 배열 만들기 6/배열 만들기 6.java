import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.isEmpty() && list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1 );
            } else {
                list.add(arr[i]);
            }
        }
        //Collections.reverse(list);
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}