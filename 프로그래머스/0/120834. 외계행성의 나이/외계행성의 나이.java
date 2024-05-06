class Solution {
    public String solution(int age) {
        String answer = "";
        String ageStr = age+"";
        for(char c : ageStr.toCharArray()){
            answer += (char)(c-48+97);
        }
        return answer;
    }
}