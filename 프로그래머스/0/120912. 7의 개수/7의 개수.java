import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] array) {
        String s = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining());
        return s.length() - s.replace("7", "").length();
    }
}