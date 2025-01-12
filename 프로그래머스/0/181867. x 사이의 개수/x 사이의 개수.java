import java.util.*;
class Solution {
    public int[] solution(String str) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = 0;
        for(char c : str.toCharArray()){
            if((c+"").equals("x")){
                st.addLast(n);
                n = 0;
            }else{
                n++;
            }
        }
        st.addLast(n);
        return st.stream().mapToInt(Integer::intValue).toArray();
    }
}