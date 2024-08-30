import java.util.Arrays;
class Solution {
    public String[] solution(String str) {
        String[] result = new String[str.length()];
        for(int i = 0; i < str.length(); i++){
            result[i] = str.substring(i);
        }
        Arrays.sort(result);
        return result;
    }
}