import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String word = String.join("", spell);
        for(String w : dic){
            char[] charArr = w.toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            if(word.equals(str)){
                return 1;
            }
        }
        return 2;
    }
}