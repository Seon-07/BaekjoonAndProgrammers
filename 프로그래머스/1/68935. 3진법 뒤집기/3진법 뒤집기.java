class Solution {
    public int solution(int n) {
       String th = n%3+"";
		while(n > 2) {
			n /= 3;
			th += (n % 3)+"";
		}
		int answer = 0;
		for(int i = 0; i < th.length(); i++) {
			int pow = (int)Math.pow(3, th.length()-i-1);
			answer += Integer.parseInt(""+th.charAt(i))*pow;
		}
		return answer;
    }
}