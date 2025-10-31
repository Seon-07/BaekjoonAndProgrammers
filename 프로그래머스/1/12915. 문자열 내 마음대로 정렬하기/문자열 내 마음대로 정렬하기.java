import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length-1; i++){
            for(int j = 0; j < strings.length-1-i; j++){
                String cur = strings[j];
                String next = strings[j+1];
                if(cur.charAt(n) == next.charAt(n)){
                    if(cur.compareTo(next) > 0){
                       String tmp = next;
                        strings[j+1] = cur;
                        strings[j] = tmp; 
                    }

                }else{
                    if(cur.charAt(n) > next.charAt(n)){
                        String tmp = next;
                        strings[j+1] = cur;
                        strings[j] = tmp;
                    }
                }
            }
        }
        return strings;
    }
}