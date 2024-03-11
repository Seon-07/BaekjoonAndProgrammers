package programmers;

public class 수박수박수박수박수박수 {
	public String solution(int n) {
        String answer = "";
		for(int i = 1; i <= n; i++) {
			answer += (i%2!=0)?"수":"박";
		}
        return answer;
    }
}
