import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] a = after.toCharArray();
        char[] b = before.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b) ? 1 : 0;
    }
}