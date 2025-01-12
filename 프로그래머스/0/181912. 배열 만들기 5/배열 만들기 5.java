import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs){
            int intStr = Integer.parseInt(str.substring(s, s+l));
            if(k < intStr) list.add(intStr);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}