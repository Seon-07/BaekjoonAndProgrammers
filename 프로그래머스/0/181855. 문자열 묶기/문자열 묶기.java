import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int result;
        Map<Integer, Integer> map = new HashMap<>();
        for(String str : strArr){
            int leng = str.length();
            if(!map.containsKey(leng)){
                map.put(leng, 1);
            }else{
                map.put(leng, map.get(leng) + 1);
            }
        }
        return Collections.max(map.values());
    }
}