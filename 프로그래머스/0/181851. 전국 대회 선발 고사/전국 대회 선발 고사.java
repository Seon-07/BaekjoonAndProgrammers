import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int result = 0;
        int cnt = 0;
        List<Integer> list = Arrays.asList(Arrays.stream(rank).boxed().toArray(Integer[]::new));
        for(int i = 0; i < rank.length; i++){
            int idx = list.indexOf(i+1);
            if(attendance[idx]){
                cnt++;
                result += idx * (int) Math.pow(100, 3-cnt);
            }
            if(cnt == 3) break;
        }
        return result;
    }
}