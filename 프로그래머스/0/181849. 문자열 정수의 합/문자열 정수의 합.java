class Solution {
    public int solution(String str) {
        int answer = 0;
        for(int i = 0; i < str.length(); i++){
            answer += Integer.parseInt(str.charAt(i)+"");
        }
        return answer;
    }
}