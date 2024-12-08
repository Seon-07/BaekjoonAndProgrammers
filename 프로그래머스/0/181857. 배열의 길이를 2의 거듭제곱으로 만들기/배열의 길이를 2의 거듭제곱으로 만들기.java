import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int leng = arr.length;

        int newSize = 1;
        while (newSize < leng) {
            newSize *= 2;
        }

        return Arrays.copyOf(arr, newSize);
    }
}