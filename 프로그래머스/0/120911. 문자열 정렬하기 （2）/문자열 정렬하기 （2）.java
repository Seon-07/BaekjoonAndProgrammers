import java.util.*;
class Solution {
    public String solution(String str) {
        str = str.toLowerCase();
        String answer = "";
        String[] k = new String [str.length()];
        int i = 0;
        for(String c : str.split("")){
            k[i] = c;
            i++;
        }
        Arrays.sort(k);
        for(String j : k){
            answer += j;
        }
        return answer;
    }
}