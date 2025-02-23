import java.util.*;
class Solution {
    Set<Integer> set = new TreeSet<>();
    
    public int[] solution(int n) {
        m(n);
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public void m(int k) {
        for (int i = 2; i <= k; i++) {
            if (k % i == 0) {
                set.add(i);  
                m(k / i);    
                return;
            }
        }
    }
}