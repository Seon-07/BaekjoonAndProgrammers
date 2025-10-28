import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = (long) Arrays.stream(times).max().getAsInt() * (long)n;
        long result = right;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (isPossible(n, times, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
    
    private boolean isPossible(int n, int[] times, long mid) {
        long total = 0;
        for (int time : times) {
            total += mid / time;
            if (total >= n) return true;
        }
        return false;
    }
}