import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        Set<Character> charSet = new HashSet<>();
        for(char c : my_string.toCharArray()){
            if(!charSet.contains(c)){
                charSet.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}