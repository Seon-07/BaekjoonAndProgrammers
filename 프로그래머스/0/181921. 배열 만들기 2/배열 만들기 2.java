import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        while(l <= r){
            boolean ok = true;
            for(char c : String.valueOf(l).toCharArray()){
                if(c != '5' && c != '0'){
                    ok = false;
                    break;
                }
            }
            if(ok){
                list.add(l);    
            }
            l++;
        }
        return list.size() == 0 ? new int[]{-1} : list.stream().mapToInt(Integer::intValue).toArray();
    }
}