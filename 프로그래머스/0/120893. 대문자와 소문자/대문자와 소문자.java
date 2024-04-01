class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                answer += (c+"").toLowerCase();
            }else{
                answer += (c+"").toUpperCase();
            }
        }
        return answer;
    }
}