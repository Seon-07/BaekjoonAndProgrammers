class Solution {
    public String solution(String[] str, String ex) {
        String answer = "";
        for(String s : str){
            if(s.indexOf(ex) == -1){
                answer += s;
            }
        }
        return answer;
    }
}