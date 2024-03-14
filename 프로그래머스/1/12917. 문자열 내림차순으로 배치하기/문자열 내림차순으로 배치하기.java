import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
		List<Integer> sList = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			sList.add((int)s.charAt(i));
		}
		sList.sort(null);
		for(int i = sList.size()-1; i >= 0; i--) {
			char k = (char)(int)sList.get(i);
			answer += k;
		}
        return answer;
    }
}