import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> pMap = new HashMap<>();
        for(String p : participant){
            Integer cnt = pMap.get(p);
            if(cnt != null){
                pMap.put(p, cnt+1);
            }else{
                pMap.put(p, 1);
            }   
        }
        for(String c : completion){
            Integer remain = pMap.get(c);
            if(remain > 1){
                pMap.replace(c, remain-1);
            }else{
                pMap.remove(c);
            }
        }
        return pMap.keySet().iterator().next();
    }
}