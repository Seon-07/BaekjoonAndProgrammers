import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            sb.append(my_str.charAt(i));
            if((i+1) % n == 0 || i == len-1){
                list.add(sb.toString());
                sb.setLength(0);
            }
        }
        return list.toArray(new String[0]);
    }
}